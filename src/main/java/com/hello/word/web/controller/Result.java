package com.hello.word.web.controller;

public class Result<T> {
	
	private int code;
	
	private String message;
	
	private String desc;
	
	private String token;
	
	private T t;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}


}
