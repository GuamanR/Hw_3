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
	private Double author; 
	// make sure to change author to calories
	private Double foodNote ;
	// make sure to change foodNote to protein
	private Double sugars;
	private Double carbohydrates;
	private Double fat;
	

	public Long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getAuthor() {
		return author;
	}

	public void setAuthor(Double author) {
		this.author = author;
	}

	public Double getFoodNote() {
		return foodNote;
	}

	public void setFoodNote(Double foodNote) {
		this.foodNote = foodNote;
	}

	public Double getSugars() {
		return sugars;
	}

	public void setSugars(Double sugars) {
		this.sugars = sugars;
	}

	public Double getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(Double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public Double getFat() {
		return fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public FoodPost(Long id, String title, Double author, Double foodNote, Double sugars, Double carbohydrates,
			Double fat) {
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
