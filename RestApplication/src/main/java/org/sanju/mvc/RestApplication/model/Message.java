package org.sanju.mvc.RestApplication.model;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.Date;


//@XmlRootElement
public class Message {
	private String message;
	private String author;
	private long id;
	private Date Created;
	
	public Message()
	{
		
	}
	public Message(String message, String author, long id) {
		
		this.message = message;
		this.author = author;
		this.id = id;
		this.Created = new Date();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCreated() {
		return Created;
	}
	public void setCreated(Date created) {
		Created = created;
	}

}

