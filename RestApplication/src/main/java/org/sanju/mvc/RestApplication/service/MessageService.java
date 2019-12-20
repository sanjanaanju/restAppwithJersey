package org.sanju.mvc.RestApplication.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sanju.mvc.RestApplication.model.Message;
public class MessageService {
	private static Map<Long, Message> messages=new HashMap<>();
	
	public MessageService() {
		messages.put(1l,new Message("Hello World","sanju",1l));
		messages.put(2l,new Message("Hello World1","sanju",2l));
	}
	 
	public List<Message> getAllMessages()
	{
		return new ArrayList<Message>(messages.values());
		
	}
	public Message getMessage(long id)
	{
		return messages.get(id);
	}
	
	public Message addMessage(Message message)
	{
		message.setId(messages.size()+1);
		messages.put(message.getId(),message);
		return message;
	}public Message updateMessage(Message message)
	{
		if(message.getId()<=0)
		{
			return null;
		}
		messages.put(message.getId(),message);
		return message;
	}
	public Message deleteMessage(long id)
	{
		return messages.remove(id);
	}
	
}

