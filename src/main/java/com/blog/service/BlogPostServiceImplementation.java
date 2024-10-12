package com.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.BlogPostRepository;
import com.blog.model.BlogPost;

@Service
public class BlogPostServiceImplementation  implements BlogPostService{

	@Autowired
	private BlogPostRepository blogPostRepo;  // A variable to fetch from controller 
												//class to serviceImplementation class

	@Override
	public BlogPost createPost(BlogPost post) {
		// TODO Auto-generated method stub
		return blogPostRepo.save(post);
	}

	@Override
	public List<BlogPost> getAllPosts() {
		// TODO Auto-generated method stub
		return blogPostRepo.findAll();
	}

	@Override
	public void deletePost(int id) {
		// TODO Auto-generated method stub
		blogPostRepo.deleteById(id);
		
	}

	@Override
	public BlogPost editPost(int id,String content) {
		// TODO Auto-generated method stub
		BlogPost  blog = blogPostRepo.findById(id).get();
		blog.setContent(content);
		blogPostRepo.save(blog);
		return blog;
	}
}
