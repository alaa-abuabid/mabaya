package com.alaa.mabaya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class Campaign {

	@Id
	@GeneratedValue
	@Column(name ="id")
	private Integer id;
	@Column(name ="status")
	private String status;
	@Column(name ="name", nullable=false)
	private String name;
	@Column(name ="bid", nullable=false)
	private double bid;
	@Column(name ="seller_id", nullable=false)
	private Integer sellerId;
	
	@PrePersist
	void preInsert() {
		if(this.status !=null) this.status= this.status.toUpperCase();
		if (!this.status.equals("DELETED"))
	       this.status ="ACTIVE";
	}
	
	
	
	
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
