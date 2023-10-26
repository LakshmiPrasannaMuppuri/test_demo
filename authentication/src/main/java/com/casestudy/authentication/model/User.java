package com.casestudy.authentication.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userid, String name, String email, String password, String phn, String dob, String usertype) {
		super();
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phn = phn;
		this.dob = dob;
		this.usertype = usertype;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="UserId")
    private int userid;

    @Column(name="Name",nullable = false)
    private String name;

    @Column(name="Email_Address",nullable = false)
    private String email;

    @Column(name="Password",nullable = false)
    private String password;

    @Column(name="Contact_No",nullable = false)
    private String phn;

    @Column(name="DOB",nullable = false)
    private String dob;

    @Column(name="UserType",nullable = false)
    private String usertype;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhn() {
		return phn;
	}

	public void setPhn(String phn) {
		this.phn = phn;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

}
