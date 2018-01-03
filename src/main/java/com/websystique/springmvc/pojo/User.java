package com.websystique.springmvc.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "user", schema = "user-admin-db")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty
	@Column(name = "firstname", unique = true, nullable = false)
	private String firstName;

	@NotEmpty
	@Column(name = "lastname", unique = true, nullable = false)
	private String lastName;

	@NotEmpty
	@Column(name = "company_id", unique = true, nullable = false)
	private int company_id;

	@NotEmpty
	@Column(name = "country_id", unique = true, nullable = false)
	private int country_id;

	@NotEmpty
	@Column(name = "state_id", unique = true, nullable = false)
	private int state_id;

	@NotEmpty
	@Column(name = "role_id", unique = true, nullable = false)
	private int role_id;

	@NotEmpty
	@Column(name = "email", unique = true, nullable = false)
	private String email;

	@NotEmpty
	@Column(name = "department_id", unique = true, nullable = false)
	private int department_id;

	@NotEmpty
	@Column(name = "username", unique = true, nullable = false)
	private String username;

	@NotEmpty
	@Column(name = "password", unique = true, nullable = false)
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public int getState_id() {
		return state_id;
	}

	public void setState_id(int state_id) {
		this.state_id = state_id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
