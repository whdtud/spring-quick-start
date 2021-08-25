package com.springbook.view.user;

public class UserVO {

	private String id;
	private String password;
	private String name;
	private String role;

	public UserVO(String id, String password, String name, String role) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}
	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", password=" + password + ", name=" + name + ", role=" + role + "]";
	}
}
