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
	private String foodNote;

	public FoodPost() {
	}

	public FoodPost(String title, String author, String foodNote) {
		this.title = title;
		this.author = author;
		this.foodNote = foodNote;
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


	public String getFoodNote() {
		return foodNote;
	}

	public void setFoodNote(String foodNote) {
		this.foodNote = foodNote;
	}

	@Override
	public String toString() {
		return "FoodPost [author=" + author + ", foodNote=" + foodNote + ", id=" + id + ", title=" + title + "]";
	}
	

	

	

}
