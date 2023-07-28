package com.met.singleinheritance;
//base class
public class Citizen {
	private String city;
	private	int pinCode;
	private String area;
	private long adharNo;
	
	//getters and setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pinCode=" + pinCode + ", area=" + area + ", adharNo=" + adharNo + "]";
	}
	
	public Citizen() {
		
		System.out.println("Citizen-Parent Class ");
	}
	public Citizen(String city, int pinCode, String area, long adharNo) {
		super();
		this.city = city;
		this.pinCode = pinCode;
		this.area = area;
		this.adharNo = adharNo;
	}
	
	

	
}
