package com.education.entity;

import org.springframework.stereotype.Component;

@Component
public class Acount {
	String num;
	String password;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
