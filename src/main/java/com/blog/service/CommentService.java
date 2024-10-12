package com.blog.service;


import com.blog.model.Comment;

public interface CommentService {
	
	Comment addComment(Comment comment);
	void  deleteComment(int id);
	
}
