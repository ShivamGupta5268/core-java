package co.Encapsulation;

import java.util.Date;

public class Person {
	
	private String name;
	private Date dob;
	private String address;
	static int AGE_AVG = 25;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setDob(Date dob){
		this.dob = dob;
	}
	public Date getDob(){
		return dob;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	public void setAGE_AVG(int AGE_AVG) {
		this.AGE_AVG = AGE_AVG;		
	}
	public int getAGE_AVG(){
		return AGE_AVG;
	}

}
