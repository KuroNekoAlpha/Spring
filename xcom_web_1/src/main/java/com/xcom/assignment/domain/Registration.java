/**
 * 
 */
package com.xcom.assignment.domain;

/**
 * @author OAK SOE KHANT
 *
 */
public class Registration {
	
	private int id;
	private OpenClass openclass;
	private String student;
	private String phone;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public OpenClass getOpenclass() {
		return openclass;
	}
	public void setOpenclass(OpenClass openclass) {
		this.openclass = openclass;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
