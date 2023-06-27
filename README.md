# Spring MVC Web Application
This repository contains a web application built using the Spring MVC framework.  
The application is designed to showcase the basic features and structure of a typical Spring MVC project.

_Please note that this is not the final version but rather the early framework of a full-fledged web application._

## Features
- **Login and Authentication**
	- Provides a login mechanism using session-based authentication
	- Displays a message if the input user details are invalid
	- Displays a message when the user has logged out
- **Authorization and Access Control**
	- Implements role-based authorization to restrict access to certain pages based on user roles
- **Dynamic Homepage**
	- Homepage displays contents based on the user's role, providing a personalized experience
- **Error Landing Page**
	- Shows a custom error page when the user accesses a forbidden link
- **Frontend Views**
	- Renders dynamic views using Thymeleaf templating engine to provide a user-friendly interface.
- **Spring Security**
	- Utilizes Spring Security for the authentication and authorization features to enhance the application's security
- **Enhanced User Management**
	- Utilizes JDBC to manage user information

## Issues and Limitations (for future updates)
- Users cannot edit their details
- Cannot create/register a new user

## Tools Used
- IntelliJ IDEA
- Spring Initializr

## Technologies Used
- Java
- Spring MVC
- Spring Boot
- Spring Security
- Spring Data JPA (with Hibernate)
- Thymeleaf