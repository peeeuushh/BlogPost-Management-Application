package com.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.model.BlogPost;


@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost,Integer>{

}
