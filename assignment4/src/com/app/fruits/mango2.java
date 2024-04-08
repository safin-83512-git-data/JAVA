package com.app.fruits;

public class mango2 {
	private String name;
	private String color;
	private double weight;
	private boolean isFresh;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	public String taste() {String s = "sweet ";
	return s;
	}
	
	public mango2(String name, String color, double weight, boolean isFresh) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
	}
	public mango2() {
		
	}
}
