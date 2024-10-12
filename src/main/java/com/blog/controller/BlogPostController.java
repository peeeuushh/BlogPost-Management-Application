package com.blog.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.dao.BlogPostRepository;
import com.blog.model.BlogPost;
import com.blog.service.BlogPostService;

@RestController  //rest controller annotation which acts as both @Controller and @ResponseBody
@RequestMapping("/blogpost")  // Main controller uri with request mapping
public class BlogPostController {
	@Autowired
	BlogPostService blogPostService;
	@Autowired
	BlogPostRepository blogRepo;
	
	// Creating a new Post 
	@PostMapping("/createpost")
	public BlogPost newPost(@RequestBody BlogPost blogPost)
	{
		return blogPostService.createPost(blogPost);
	}
	
	// Getting all the posts
	@GetMapping("/getAllPosts")  
	public List<BlogPost> showAllPosts(){
		List<BlogPost> postList = blogPostService.getAllPosts();
		if(postList != null && !postList.isEmpty())
		{
			return postList;
		}
		else {
			return Collections.emptyList();
		}
	}
	
	// Deleting a post with ID
	@DeleteMapping("/delPost{id}")
	public void delPost(@PathVariable ("id") int id)
	{
		blogPostService.deletePost(id);
	}
//	
	@PutMapping("/update/{id}")
	public BlogPost editBlogPost(@PathVariable("id") int id, @RequestBody String Content)
	{
//		int temp_id = Integer.parseInt(id);
		return blogPostService.editPost(id, Content);
	}
}


