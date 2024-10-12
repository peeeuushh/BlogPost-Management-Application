package com.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
