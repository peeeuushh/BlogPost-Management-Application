package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.model.Comment;
import com.blog.service.CommentService;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    @Autowired
    private CommentService commentservice;
    
    @PostMapping("/add")
    public Comment addComment(@RequestBody Comment comment) {
        return commentservice.addComment(comment);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteComment(@PathVariable ("id") int id) {
        commentservice.deleteComment(id);
    }
    
    
}
