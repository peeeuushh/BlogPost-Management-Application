package com.blog.service;

import java.util.List;

import com.blog.model.BlogPost;

public interface BlogPostService {
	
	BlogPost createPost(BlogPost post); // Creating a New Post
	List<BlogPost> getAllPosts();  // Getting all the posts
	void deletePost(int id); // Deleting a Post ( Note :-  We are deleting by ID , 
								// in future we will change according to requirements
	BlogPost editPost(int id , String content);
	
}
