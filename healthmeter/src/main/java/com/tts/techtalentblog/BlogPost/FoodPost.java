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
	private int foodNote ;
	// make sure to change foodNote to protein
	private double sugars;
	private double carbohydrates;
	private double fat;

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

	public int getFoodNote() {
		return foodNote;
	}

	public void setFoodNote(int foodNote) {
		this.foodNote = foodNote;
	}

	public double getSugars() {
		return sugars;
	}

	public void setSugars(double sugars) {
		this.sugars = sugars;
	}

	public double getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public FoodPost() {
	}

	public FoodPost(Long id, String title, String author, int foodNote, double sugars, double carbohydrates,
			double fat) {
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

	
	
	

	

	

}
