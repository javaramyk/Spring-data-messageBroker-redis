package com.example.RedisPubSub.springredismessageBroker.subscriber;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

public class Receiver implements MessageListener{

	Logger logger = LoggerFactory.getLogger(Receiver.class);
	@Override
	public void onMessage(Message message, byte[] pattern) {
		// TODO Auto-generated method stub
	       logger.info("Consumed event {}",message);	
	}

	
}
