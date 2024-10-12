# Blog Post Management Application

This is a web application developed using Java and Spring Boot that allows users to create, read, update, and delete blog posts. The application also includes a commenting system, user authentication and authorization, and profile management features.

## Features

### 1. Authentication and Authorization
- Users must register and log in to access the application.
- Only authenticated users can create, update, or delete blog posts.
- Authorization is enforced to ensure that users can only edit or delete their own blog posts.

### 2. Blog Post Management
- Users can create new blog posts with a title, content, and author information.
- Users can edit or delete their own blog posts.
- All blog posts are listed in a blog post section, which can be sorted and filtered based on different criteria.

### 3. Commenting System
- Users can add comments to blog posts.
- Each comment includes the comment text, author information, and the date it was posted.

### 4. Blog Post Listing
- All blog posts are displayed in a list.
- Users can sort and filter blog posts based on title, date, or author.

### 5. User Profile Management
- Users can view and edit their profile information, including their name, email address, and password.

## Tech Stack

- **Backend**: Java, Spring Boot
- **Database**: MySQL (or other relational databases supported by Spring Data JPA)
- **Frontend**: Thymeleaf (or any frontend technology of your choice)
