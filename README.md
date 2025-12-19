# Book_Servlet_Advanced_Java

A lightweight web application built using Java Servlets, JSP, and JDBC to register and view books. Ideal for learning core servlet concepts, form handling, and database connectivity in a Java EE environment.

📁 Project Structure
# Code
Book_Servlet_Advanced_Java/

├── src/

│   └── com/cdac

│       ├── Book.java              # Model class representing a book

│       ├── BookDAO.java           # DAO class for database operations

│       ├── BookServlet.java       # Handles book registration logic

│       └── ViewBookServlet.java   # Displays list of registered books

├── WebContent/

│   ├── book.html                  # HTML form to register a book

│   ├── error.html                 # Error page for failed operations

│   ├── success.jsp                # Confirmation page after successful registration

│   ├── viewBook.jsp               # JSP page to display all books

│   └── WEB-INF/

│       └── web.xml                # Deployment descriptor for servlet mapping

├── README.md                      # Project overview and setup instructions

# 🚀 Setup Guide
Prerequisites
Java 17+

Apache Tomcat 9+

MySQL or MariaDB

IDE (Eclipse/IntelliJ) with servlet support

# Steps to Run
Clone the repository

bash
git clone https://github.com/akshayuparikar/Book_Servlet_Advanced_Java.git
Configure database

Create a database named dacakshay

Create a table:

sql
CREATE TABLE books (
  id INT PRIMARY KEY AUTO_INCREMENT,
  BookName VARCHAR(255),
  Author VARCHAR(255),
  Course VARCHAR(255),
);
Update JDBC credentials

Modify BookDAO.java to include your DB username and password.

Deploy to Tomcat

Import project into your IDE and build as a Dynamic Web Project.

Deploy to Tomcat via IDE or manually copy to webapps/.

Access the app

# Code
http://localhost:8080/Book_Servlet_Advanced_Java/book.html

# ✨ Features
📘 Book Registration: Submit book details via HTML form.

📄 View Books: Display all registered books using JSP and servlet logic.

🔗 Servlet Architecture: Clean separation using DAO, model, and servlet controllers.

🛠️ JDBC Integration: Direct database access using standard JDBC.

🧩 HTML + JSP Views: Simple UI with form validation and feedback.

🧪 Tomcat Deployment: Easily deployable on any servlet container.
