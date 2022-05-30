package com.spring.entities;

public class User {

	
	private int userId;
	private int Id;
	private String title; 
	private String completed;
	public User(int userId, int id, String title, String completed) {
		super();
		this.userId = userId;
		Id = id;
		this.title = title;
		this.completed = completed;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompleted() {
		return completed;
	}
	public void setCompleted(String completed) {
		this.completed = completed;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", Id=" + Id + ", title=" + title + ", completed=" + completed + "]";
	}
	
	
	
}
