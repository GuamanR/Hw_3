package com.tts.techtalentblog.BlogPost;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogPostController {

	@Autowired
	private FoodPostRepository foodPostRepository;

	private List<FoodPost> posts = new ArrayList<>();

	// localhost:8080
	// Handle get request to forward slash
	@GetMapping(value = "/")
	public String index(FoodPost foodNote, Model model) {
		// Remove all current posts inside of the arraylist called posts, from line 22
		posts.removeAll(posts);

		// This for each loop goes over the entire repository(all blog posts), and for
		// each one it adds them
		// to the posts array list
		for (FoodPost postFromDB : foodPostRepository.findAll()) {
			posts.add(postFromDB);
		}

		// this line makes the posts array list available to the webpage to be viewed
		model.addAttribute("posts", posts);

		return "foodtracker/index";
	}

	@GetMapping(value = "/foodtracker/new")
	public String newFood(FoodPost foodNote) {
		return "foodtracker/new";
	}

	@PostMapping(value = "/foodtracker")
	public String addNewFoodPost(FoodPost foodNote, Model model) {
		// We do not want to create a new instance everytime,
		// instead we can pass in the foodNote as is.
		// Springboot is doing the hard work for us in the background
		foodPostRepository.save(foodNote);

		model.addAttribute("title", foodNote.getTitle());
		model.addAttribute("author", foodNote.getAuthor());
		model.addAttribute("foodNote", foodNote.getFoodNote());
		model.addAttribute("sugars", foodNote.getSugars());
		model.addAttribute("carbohydrates", foodNote.getCarbohydrates());
		model.addAttribute("fat", foodNote.getFat());
		return "foodtracker/result";
	}

	@PostMapping(value = "/foodtracker/update/{id}")
	public String updateExistingPost(@PathVariable Long id, FoodPost foodNote, Model model) {
		Optional<FoodPost> post = foodPostRepository.findById(id);

		if (post.isPresent()) {
			// Created a
			FoodPost actualPost = post.get();

			actualPost.setTitle(foodNote.getTitle());
			actualPost.setAuthor(foodNote.getAuthor());
			actualPost.setFoodNote(foodNote.getFoodNote());
			actualPost.setSugars(foodNote.getSugars());
			actualPost.setCarbohydrates(foodNote.getCarbohydrates());
			actualPost.setFat(foodNote.getFat());

			foodPostRepository.save(actualPost);

			model.addAttribute("foodNote", actualPost);

		} else {
			// Handle the error here
		}

		return "foodtracker/result";

	}

	@RequestMapping(value = "/foodtracker/delete/{id}")
	public String deletePostWithId(@PathVariable Long id, FoodPost foodNote) {
		// Takes id from the URL path, passes it into deleteById from the CRUD
		// repository
		foodPostRepository.deleteById(id);
		return "foodtracker/delete";
	}

	// This is the mapping to edit a specific post
	@RequestMapping(value = "/foodtracker/edit/{id}")
	public String editPostWithId(@PathVariable Long id, Model model) {
		// Use blogPostRepo to find post by id
		// It returns an Optional<T>
		// Use a variable to store the the foodNote if its there
		Optional<FoodPost> editPost = foodPostRepository.findById(id);

		// Initalize a variable to be filled by the post if it exists
		FoodPost result;

		// use Optional method, to check if the post came through
		if (editPost.isPresent()) {
			// if the post came through, store it in result
			result = editPost.get();
			// add attribute to page, accessible through model
			model.addAttribute("foodNote", result);
		} else {
			// Need to handle error here, you could use a html error page
			return "Error";
		}

		// Show browser the blogpost/edit page
		return "foodtracker/edit";
	}

}
