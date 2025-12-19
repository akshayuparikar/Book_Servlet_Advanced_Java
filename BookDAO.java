package com.cdac;

import java.sql.*;
import java.util.*;

public class BookDAO {

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/dacakshay", "root", "Akshay@1008");
    }

    public int writeBook(Book b) throws Exception {
        String sql = "INSERT INTO Book(BookName, Author, Course) VALUES (?, ?, ?)";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, b.getBookName());
            ps.setString(2, b.getAuthor());
            ps.setString(3, b.getCourse());
            return ps.executeUpdate();
        }
    }

    public List<Book> getAllBook() throws Exception {
        List<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM Book";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Book b = new Book();
                b.setId(rs.getInt("id"));
                b.setBookName(rs.getString("BookName"));
                b.setAuthor(rs.getString("Author"));
                b.setCourse(rs.getString("Course"));
                list.add(b);
            }
        }
        return list;
    }
}
