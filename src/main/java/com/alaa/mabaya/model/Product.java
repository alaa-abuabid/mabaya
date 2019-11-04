package com.alaa.mabaya.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@Column(name ="serial_number")
	private UUID serial_number;
	@Column(name ="title")
	private String title;
	@Column(name ="price")
	private double price;
	@Column(name ="category")
	private String category;
	@Column(name ="sellerId")
	private int sellerId;
	
	
	
	public Product() {
		super();
	}
	
	public Product( String title, double price, String category, int sellerId) {
		super();
		this.serial_number =  UUID.randomUUID();
		this.title = title;
		this.price = price;
		this.category = category;
		this.sellerId = sellerId;
	}
	
	
	public UUID getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(UUID serial_number) {
		this.serial_number = serial_number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
}
