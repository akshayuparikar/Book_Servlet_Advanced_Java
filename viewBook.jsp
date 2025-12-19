<%@ page import="java.util.*, com.cdac.Book" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Books</title>
</head>
<body>
    <h2>All Registered Books</h2>
    <table border="1" cellpadding="10">
        <tr>
            <th>ID</th><th>Book Name</th><th>Author</th><th>Course</th>
        </tr>
    <%
        List<Book> list = (List<Book>) request.getAttribute("BookList");
        if (list != null) {
            for (Book b : list) {
    %>
        <tr>
            <td><%= b.getId() %></td>
            <td><%= b.getBookName() %></td>
            <td><%= b.getAuthor() %></td>
            <td><%= b.getCourse() %></td>
        </tr>
    <%
            }
        }
    %>
    </table>
    <br>
    <a href="book.html">Add Book</a>
</body>
</html>
