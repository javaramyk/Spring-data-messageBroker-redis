package com.example.RedisPubSub.springredismessageBroker.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product{
	private int id;
	private String name;
	private int qty;
	private long price;
	
}