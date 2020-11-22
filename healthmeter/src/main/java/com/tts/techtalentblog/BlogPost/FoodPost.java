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
	// make sure to change author to calories
	private String foodNote ;
	// make sure to change foodNote to protein
	private String sugars;
	private String carbohydrates;
	private String fat;

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

	public String getSugars() {
		return sugars;
	}

	public void setSugars(String sugars) {
		this.sugars = sugars;
	}

	public String getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(String carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public String getFat() {
		return fat;
	}

	public void setFat(String fat) {
		this.fat = fat;
	}

	public FoodPost(Long id, String title, String author, String foodNote, String sugars, String carbohydrates,
			String fat) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.foodNote = foodNote;
		this.sugars = sugars;
		this.carbohydrates = carbohydrates;
		this.fat = fat;
	}
	

	@Override
	public String toString() {
		return "FoodPost [author=" + author + ", carbohydrates=" + carbohydrates + ", fat=" + fat + ", foodNote="
				+ foodNote + ", id=" + id + ", sugars=" + sugars + ", title=" + title + "]";
	}

	public FoodPost() {
	}

	
	
	
	
	

	

	

}
