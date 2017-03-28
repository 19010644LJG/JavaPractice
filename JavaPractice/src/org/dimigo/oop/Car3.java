/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 * org.dimigo.oop
 * 	 |_Car
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23. 
 * </pre>
 * 
 * @author : 이준구
 * @version : 1.0
 */
public class Car3 {
	

	private String model;
	private String company;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car3(String model, String company, String color, int maxSpeed, int price) {
		this.model = model;
		this.company = company;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	public Car3(String model, String company, String color, int maxSpeed) {
		this(model,company,color,maxSpeed,0);
	}
	public Car3(String model, String company, String color) {
		this(model,company,color,0);
	}

	public String getcompany() {
		return company;
	}
	public String getmodel() {
		return model;
	}
	public String getcolor() {
		return color;
	}
	public int getmaxSpeed() {
		return maxSpeed;
	}
	public int getprice() {
		return price;
	}

		
	}