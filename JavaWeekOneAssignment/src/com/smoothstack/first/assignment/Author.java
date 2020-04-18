package com.smoothstack.first.assignment;

import java.io.Serializable;

public class Author implements Serializable {
	
	
	/** 
	 * 
	 */
	private static final long serialVersionUID = -3702446166935923732L;
	private Integer authorId;
	private String authorName;
	private Integer publisherID;
	
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

	/**
	 * @return the publisherID
	 */
	public Integer getPublisherID() {
		return publisherID;
	}

	/**
	 * @param publisherID the publisherID to set
	 */
	public void setPublisherID(Integer publisherID) {
		this.publisherID = publisherID;
	}
}

