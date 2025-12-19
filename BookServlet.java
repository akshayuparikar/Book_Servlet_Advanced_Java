package com.cdac;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class BookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String bookName = req.getParameter("BookName");
        String author = req.getParameter("Author");
        String course = req.getParameter("Course");

        Book b = new Book(bookName, author, course);
        BookDAO dao = new BookDAO();

        try {
            int status = dao.writeBook(b);
            if (status > 0) {
            	res.sendRedirect("success.jsp");
            	res.getWriter().println("Book added successfully");
            } else {
                res.sendRedirect("error.html");
            }
        } catch (Exception e) {
            throw new ServletException("Error saving book", e);
        }
    }
}
