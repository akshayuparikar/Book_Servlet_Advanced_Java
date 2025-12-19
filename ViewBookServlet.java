package com.cdac;

import java.io.IOException;
import java.util.List;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ViewBookServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        BookDAO dao = new BookDAO();
        try {
            List<Book> list = dao.getAllBook();
            req.setAttribute("BookList", list);
            RequestDispatcher rd = req.getRequestDispatcher("viewBook.jsp");
            rd.forward(req, resp);
        } catch (Exception e) {
            throw new ServletException("Error retrieving books", e);
        }
    }
}
