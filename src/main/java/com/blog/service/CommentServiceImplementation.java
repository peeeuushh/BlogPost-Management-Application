package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.blog.dao.CommentRepository;
import com.blog.model.Comment;
@Service
public class CommentServiceImplementation implements CommentService {
	
	@Autowired
	private CommentRepository commentrepository;

	@Override
	public Comment addComment(Comment comment) {
		// TODO Auto-generated method stub
		return commentrepository.save(comment);
	}

	@Override
	public void deleteComment(int id) {
		// TODO Auto-generated method stub
		commentrepository.deleteById(id);
	}

	
	

	
	

}
