package org.sanju.mvc.RestApplication.database;
import org.sanju.mvc.RestApplication.model.Message;

import java.util.Map;

import java.util.HashMap;
public class DataBaseClass {
	private static Map<Long, Message> messages=new HashMap<>();
	
	private static Map<Long, Message> getMessages()
			{
		return messages;
			}

}

