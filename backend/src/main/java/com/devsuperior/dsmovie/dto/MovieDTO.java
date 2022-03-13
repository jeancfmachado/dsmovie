package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

public class MovieDTO {
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String Image;
	
	public MovieDTO() {}

	public MovieDTO(Long id, String title, Double score, Integer count, String image) {
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		Image = image;
	}
	
	//Construtor MovieDTO com objeto Movie
	public MovieDTO(Movie movie) {
		id = movie.getId();
		title = movie.getTitle();
		score = movie.getScore();
		count = movie.getCount();
		Image = movie.getImage();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}
	
	
}
