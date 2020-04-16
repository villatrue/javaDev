package com.smoothstack.first.assignment;

import java.io.Serializable;

public class Author implements Serializable {
	
	private static final long serialVersionUID = 8616628457974986169L;
		
	private Integer authorId;
	private String authorName;
	
	public Author(Integer authorId, String authorName) {
		this.setAuthorId(authorId);
		this.setAuthorName(authorName);
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
}

