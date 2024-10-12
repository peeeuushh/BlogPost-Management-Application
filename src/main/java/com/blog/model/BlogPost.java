package com.blog.model;

import java.sql.Date;

//import org.hibernate.annotations.GeneratorType;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


// Team of Dinesh, Harsh , Chinmayee (BackendTeam)


@Entity
@Table(name="blog")
public class BlogPost {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="blog_id")
	private int id;
	
	private String title; // title of the blog
	private String content; // blog discription
	// private String comment; 
	@Column(name="author_name")
	private String author; // author of the blog
	private int author_id; // author_id is taken as an entity because to make relations between tables
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Column(name="b_date")
    private Date date; // date is taken as an entity to represent on which date the blog has been posted
	
	
	// Parameterised Constructor for class BlogPost
	public BlogPost(int id, String title, String content, String author, int author_id, Date date) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.author = author;
		this.author_id = author_id;
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "BlogPost [id=" + id + ", title=" + title + ", content=" + content + ", author=" + author
				+ ", author_id=" + author_id + ", date=" + date + "]";
	}


	// Default constructor for class BlogPost
	
	public BlogPost() {
		
	}

	// getter methods for entities
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}

	// setter methods for entities
	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getAuthor_id() {
		return author_id;
	}


	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}

	

	

	
	
	
	
	
	
}
