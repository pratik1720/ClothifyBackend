package com.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Coupons {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
   private String brand;
   private int discount;
   
   private Date validity;
   @ManyToOne
   @JoinColumn(name="uid")
   private User uid;
public Coupons() {
	super();
	// TODO Auto-generated constructor stub
}
public Coupons(int cid, String brand, int discount, Date validity, User uid) {
	super();
	this.cid = cid;
	this.brand = brand;
	this.discount = discount;
	this.validity = validity;
	this.uid = uid;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public Date getValidity() {
	return validity;
}
public void setValidity(Date validity) {
	this.validity = validity;
}
public User getUid() {
	return uid;
}
public void setUid(User uid) {
	this.uid = uid;
}
@Override
public String toString() {
	return "Coupons [cid=" + cid + ", brand=" + brand + ", discount=" + discount + ", validity=" + validity + ", uid="
			+ uid + "]";
}
   
}
