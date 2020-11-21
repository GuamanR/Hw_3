package com.tts.techtalentblog.BlogPost;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FoodPost {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String title;
	private String author;
	private String blogEntry;

	public FoodPost() {
	}

	public FoodPost(String title, String author, String blogEntry) {
		this.title = title;
		this.author = author;
		this.blogEntry = blogEntry;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBlogEntry() {
		return blogEntry;
	}

	public void setBlogEntry(String blogEntry) {
		this.blogEntry = blogEntry;
	}

	@Override
	public String toString() {
		return "FoodPost [author=" + author + ", blogEntry=" + blogEntry + ", id=" + id + ", title=" + title + "]";
	}

	

}
