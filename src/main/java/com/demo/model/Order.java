package com.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="pickuporder")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
   private Date pickupDate;
   private String pickupDescription;
   
   private int noOfItems;
   @ManyToOne
   @JoinColumn(name="uid")
   private User uid;
   
   @ManyToOne
   @JoinColumn(name="pid")
   private Pickup pid;
public Order() {
	super();
	// TODO Auto-generated constructor stub
}

public Order(int oid, Date pickupDate, String pickupDescription, int noOfItems, User uid, Pickup pid) {
	super();
	this.oid = oid;
	this.pickupDate = pickupDate;
	this.pickupDescription = pickupDescription;
	this.noOfItems = noOfItems;
	this.uid = uid;
	this.pid = pid;
}


public Pickup getPid() {
	return pid;
}

public void setPid(Pickup pid) {
	this.pid = pid;
}

public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public Date getPickupDate() {
	return pickupDate;
}
public void setPickupDate(Date pickupDate) {
	this.pickupDate = pickupDate;
}
public String getPickupDescription() {
	return pickupDescription;
}
public void setPickupDescription(String pickupDescription) {
	this.pickupDescription = pickupDescription;
}
public int getNoOfItems() {
	return noOfItems;
}
public void setNoOfItems(int noOfItems) {
	this.noOfItems = noOfItems;
}
public User getUid() {
	return uid;
}
public void setUid(User uid) {
	this.uid = uid;
}
@Override
public String toString() {
	return "Order [oid=" + oid + ", pickupDate=" + pickupDate + ", pickupDescription=" + pickupDescription
			+ ", noOfItems=" + noOfItems + ", uid=" + uid + "]";
}
   
}
