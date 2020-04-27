package com.spring.json;

import java.time.LocalDate;

public class Administrator 
{
	private long id;
	private String title;
	private String name;
	private String category;
	private String description;
	private String postId;
	private String status;
	private String searchText;
	private LocalDate date;
	public Administrator()
	{
		super();
	}
	
	public Administrator(long id,String title, String name, String category, String description, String postId,
			String status , String searchText,LocalDate date) 
	{
		super();
		this.id=id;
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
		this.postId = postId;
		this.status = status; 
		this.searchText = searchText;
		this.date=date;
	}
	
	public Administrator(String title, String name, String category, String description, String postId,
			String status, String searchText) 
	{
		super();
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
		this.postId = postId;
		this.status = status;
		 
		this.searchText = searchText;
	}
	public Administrator( long id,String title, String name, String category, String description) 
	{
		super();
		this.id=id;
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
	}
	public Administrator( long id,String title, String name, String category, String description, String postId) 
	{
		super();
		this.id=id;
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
		this.postId = postId;
	}
	public Administrator(long id, String title, String name, String category, String description, String postId,
			String status) 
	{
		super();
		this.id=id;
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
		this.postId = postId;
		this.status = status;
	}
	public Administrator(long id, String title, String name, String category, String description, String postId,
			String status, String searchText) 
	{
		super();
		this.id=id;
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
		this.postId = postId;
		this.status = status;
		this.searchText=searchText;
	}
	 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPostid() {
		return postId;
	}

	public void setPostid(String postId) {
		this.postId = postId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
 
	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public boolean equals(Object obj) 
	{
		Administrator other = (Administrator) obj;
		if (this.postId.equals(other.postId))
			return true;
		return false;
	}


	@Override
	public String toString() {
		return "Advertise [id=" + id + ", title=" + title + ", name=" + name + ", category=" + category
				+ ", description=" + description + ", postId=" + postId + ", status=" + status  
				+ ", searchText=" + searchText + ", Date=" + date + "]";
	}

}
