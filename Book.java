package com.cdac;

public class Book {
    private int id;
    private String bookName;
    private String author;
    private String course;

    public Book() {}

    public Book(String bookName, String author, String course) {
        this.bookName = bookName;
        this.author = author;
        this.course = course;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getBookName() { return bookName; }
    public void setBookName(String bookName) { this.bookName = bookName; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
}
