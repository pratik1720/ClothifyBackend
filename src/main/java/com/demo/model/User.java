package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;

	private String username;

	private String name;

	private String email;

	private long phone_no;

	private String password;

	private String address;
	@Column(columnDefinition="varchar(255) default 'user'" ,insertable = false)
	private String role;
    @ManyToOne
    @JoinColumn(name="pid")
	private Pickup pid;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int uid, String username, String name, String email, long phone_no, String password, String address,
			String role, Pickup pid) {
		super();
		this.uid = uid;
		this.username = username;
		this.name = name;
		this.email = email;
		this.phone_no = phone_no;
		this.password = password;
		this.address = address;
		this.role = role;
		this.pid = pid;
	}

   public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
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

   public String getRole() {
		return role;
	}

   public void setRole(String role) {
		this.role = role;
	}

   public Pickup getPid() {
		return pid;
	}

   public void setPid(Pickup pid) {
		this.pid = pid;
	}

    @Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", name=" + name + ", email=" + email + ", phone_no="
				+ phone_no + ", password=" + password + ", address=" + address + ", role=" + role + ", pid=" + pid
				+ "]";
	}	

}
