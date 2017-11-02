package com.internousdev.login3.dto;

public class Reservation {
	private String name;
	private String phone;
	private String number;
	private String date;
	//////////////////////以下、カプセル化
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getPhone(){
		return phone;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getNumber(){
		return number;
	}
	public void setNumber(String number){
		this.number= number;
	}
	public String getDate(){
		return date;
	}
	public void setDate(String date){
		this.date = date;
	}
}
