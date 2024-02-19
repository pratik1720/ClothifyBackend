package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pickup {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;

	private String username;

	private String name;

	private String email;

	private long phone_no;

	private String password;

	private String address;
	
	private boolean isActive;

	public Pickup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pickup(int pid, String username, String name, String email, long phone_no, String password, String address,
			boolean isActive) {
		super();
		this.pid = pid;
		this.username = username;
		this.name = name;
		this.email = email;
		this.phone_no = phone_no;
		this.password = password;
		this.address = address;
		this.isActive = isActive;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Pickup [pid=" + pid + ", username=" + username + ", name=" + name + ", email=" + email + ", phone_no="
				+ phone_no + ", password=" + password + ", address=" + address + ", isActive=" + isActive + "]";
	}
	
}
