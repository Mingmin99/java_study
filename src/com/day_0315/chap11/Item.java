package com.day_0315.chap11;

public class Item {
	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Item(String name) {
		this.name = name;
		this.price = 0;

	}

	public Item(String name, int price) {
		this.name = name;
		this.price = 0;

	}

}
