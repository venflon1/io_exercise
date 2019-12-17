package io_exercise;

import java.io.Serializable;

public class Message implements Serializable{
	
	private String username;
	private String textMessage;
	public String getUsername() {
		return username;
	}
	
	public Message() {
		super();
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getTextMessage() {
		return textMessage;
	}
	
	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}
}
