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
- **Frontend Views**
	- Renders dynamic views using Thymeleaf templating engine to provide a user-friendly interface.
- **Spring Security**
	- Utilizes Spring Security for the authentication and authorization features to enhance the application's security

## Issues and Limitations (for future updates)
- User details are hard-coded and exposed; not stored in a database
- No custom error page when the user is accessing a forbidden link
- Users cannot edit their details

## Tools Used
- IntelliJ IDEA
- Spring Initializr

## Technologies Used
- Java
- Spring MVC
- Spring Boot
- Spring Security
- Thymeleaf
