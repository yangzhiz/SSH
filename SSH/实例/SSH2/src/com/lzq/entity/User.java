package com.lzq.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_USER")
public class User {

	@Id
	@Column(name = "USERNAME", length = 100, nullable = false)
	private String userName;

	@Column(name = "PASSWORD", length = 100)
	private String password;

	@Column(name = "USERID", length = 50)
	private String userId;

	@Column(name = "AGE", length = 10)
	private int age;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
