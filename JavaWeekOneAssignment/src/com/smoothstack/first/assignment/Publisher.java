package com.smoothstack.first.assignment;

import java.io.Serializable;

public class Publisher implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -347347463337721955L;
	/**
	 * 
	 */
	private Integer publisherId;
	private String publisherName;
	private String address;
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the publisherName
	 */
	public String getPublisherName() {
		return publisherName;
	}
	/**
	 * @param publisherName the publisherName to set
	 */
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	/**
	 * @return the publisherId
	 */
	public Integer getPublisherId() {
		return publisherId;
	}
	/**
	 * @param publisherId the publisherId to set
	 */
	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}

	
}

//publisher_idPublisher  publisher_id, publisher_name and addres