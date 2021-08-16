package io.spring.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.sun.istack.NotNull;

@Entity
@Table(name="Employee_PayRoll")
public class EmployeePayRoll 
{
	@Id
	@GeneratedValue
	private long id;
	@Pattern(regexp ="^[A-Z]{1}[a-z]{2,15}$")
	private String name;
	@Pattern(regexp = "^[a-zA-Z]{1,8}[//s[a-z]]{1,6}$")
	private String addr;
	
	@Pattern(regexp = "^[^0-9][A-z]{1}[a-z]{2,15}$")
	private String city;
	
	@Pattern(regexp = "^[^0-9][A-z]{1}[a-z]{2,15}$")
	private String state;

	@Pattern(regexp = "^[3-9]{1}[0-9]{5}$")
	private String zip;
	//@Pattern(regexp = "^[7-9]{1}[0-9]{9}$")
	private double phone;
	
	public EmployeePayRoll(String name, String addr, String city, String state, String zip, double phone) {
		super();
		this.name = name;
		this.addr = addr;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
	}
	
	public EmployeePayRoll()
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public double getPhone() {
		return phone;
	}

	public void setPhone(double phone) {
		this.phone = phone;
	}
	
	
}
