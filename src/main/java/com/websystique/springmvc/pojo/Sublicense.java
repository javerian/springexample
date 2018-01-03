package com.websystique.springmvc.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "sublicense", schema = "user-admin-db")
public class Sublicense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty
	@Column(name = "primary_license_id", nullable = false)
	private Integer primary_license_id;

	@NotEmpty
	@Column(name = "type", nullable = false)
	private String type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPrimary_license_id() {
		return primary_license_id;
	}

	public void setPrimary_license_id(Integer primary_license_id) {
		this.primary_license_id = primary_license_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
