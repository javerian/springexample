package com.websystique.springmvc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "licenseAllocation", schema = "user-admin-db")
public class LicenseAllocation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty
	@Column(name = "license_id", nullable = false)
	private int license_id;

	@NotEmpty
	@Column(name = "user_id", nullable = false)
	private int user_id;

	@NotEmpty
	@Column(name = "comapny_id", nullable = false)
	private int comapny_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getLicense_id() {
		return license_id;
	}

	public void setLicense_id(int license_id) {
		this.license_id = license_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getComapny_id() {
		return comapny_id;
	}

	public void setComapny_id(int comapny_id) {
		this.comapny_id = comapny_id;
	}

}
