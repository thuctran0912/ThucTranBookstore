package com.example.Bookstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String author, title, isbn;
	int reYear;
	
	@ManyToOne
	@JoinColumn(name = "categoryid")
	private Category category;
	
	public Book() {}
	
	public Book(String author, String title, int reYear, String isbn, Category category) {
		super();
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		this.reYear = reYear;
		this.category = category;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReYear() {
		return reYear;
	}

	public void setReYear(int reYear) {
		this.reYear = reYear;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title + ", year=" + reYear + ", isbn=" + isbn + "]";
	}
	
	
}
