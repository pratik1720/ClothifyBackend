package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="pickupfeedback")
public class PickupFeedBack {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;
    @Column(name="feedback")
	private String feedBackPickUpPerson;
   @ManyToOne
   @JoinColumn(name="uid")
   private User uid;
   
   @ManyToOne
   @JoinColumn(name="pid")
   private Pickup pid;

public PickupFeedBack() {
	super();
	// TODO Auto-generated constructor stub
}

public PickupFeedBack(int fid, String feedBackPickUpPerson, User uid, Pickup pid) {
	super();
	this.fid = fid;
	this.feedBackPickUpPerson = feedBackPickUpPerson;
	this.uid = uid;
	this.pid = pid;
}

public int getFid() {
	return fid;
}

public void setFid(int fid) {
	this.fid = fid;
}

public String getFeedBackPickUpPerson() {
	return feedBackPickUpPerson;
}

public void setFeedBackPickUpPerson(String feedBackPickUpPerson) {
	this.feedBackPickUpPerson = feedBackPickUpPerson;
}

public User getUid() {
	return uid;
}

public void setUid(User uid) {
	this.uid = uid;
}

public Pickup getPid() {
	return pid;
}

public void setPid(Pickup pid) {
	this.pid = pid;
}

@Override
public String toString() {
	return "PickupFeedBack [fid=" + fid + ", FeedBackPickUpPerson=" + feedBackPickUpPerson + ", uid=" + uid + ", pid="
			+ pid + "]";
}
   
}
