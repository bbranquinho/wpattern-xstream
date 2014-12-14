package org.wpattern.xstream.beans;

import java.util.Date;

public class RecordBean {

	private String firstName;

	private String lastName;

	private int age;

	private String address;

	private Date registerDate;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	@Override
	public String toString() {
		return "RecordBean [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", address=" + address + ", registerDate="
				+ registerDate + "]";
	}

}
