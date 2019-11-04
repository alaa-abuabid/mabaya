package com.alaa.mabaya.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Campaign {

	@Id
	@GeneratedValue
	@Column(name ="id")
	private Integer id;
	@Column(name ="status")
	private String status;
	@Column(name ="name")
	private String name;
	@Column(name ="bid")
	private double bid;
	@Column(name ="seller_id")
	private Integer sellerId;
	
	
	
	
	
	
	public Campaign() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Campaign [id=" + id + ", status=" + status + ", name=" + name + ", bid=" + bid + ", sellerId="
				+ sellerId + "]";
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBid() {
		return bid;
	}
	public void setBid(double bid) {
		this.bid = bid;
	}
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public Integer getId() {
		return id;
	}
	
}
