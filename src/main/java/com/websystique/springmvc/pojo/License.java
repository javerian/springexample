package com.websystique.springmvc.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "license", schema = "user-admin-db")
public class License implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "license_type_id")
	private Integer license_type_id;

	@Column(name = "license_type_id")
	private Date valid_from;

	@Column(name = "license_type_id")
	private Date valid_to;

	@Column(name = "license_type_id")
	private Integer company_id;

	@Column(name = "license_type_id")
	private Integer no_of_license_issued;

	@Column(name = "license_type_id")
	private Integer no_of_license_consumed;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLicense_type_id() {
		return license_type_id;
	}

	public void setLicense_type_id(Integer license_type_id) {
		this.license_type_id = license_type_id;
	}

	public Date getValid_from() {
		return valid_from;
	}

	public void setValid_from(Date valid_from) {
		this.valid_from = valid_from;
	}

	public Date getValid_to() {
		return valid_to;
	}

	public void setValid_to(Date valid_to) {
		this.valid_to = valid_to;
	}

	public Integer getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}

	public Integer getNo_of_license_issued() {
		return no_of_license_issued;
	}

	public void setNo_of_license_issued(Integer no_of_license_issued) {
		this.no_of_license_issued = no_of_license_issued;
	}

	public Integer getNo_of_license_consumed() {
		return no_of_license_consumed;
	}

	public void setNo_of_license_consumed(Integer no_of_license_consumed) {
		this.no_of_license_consumed = no_of_license_consumed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company_id == null) ? 0 : company_id.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((license_type_id == null) ? 0 : license_type_id.hashCode());
		result = prime * result + ((no_of_license_consumed == null) ? 0 : no_of_license_consumed.hashCode());
		result = prime * result + ((no_of_license_issued == null) ? 0 : no_of_license_issued.hashCode());
		result = prime * result + ((valid_from == null) ? 0 : valid_from.hashCode());
		result = prime * result + ((valid_to == null) ? 0 : valid_to.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		License other = (License) obj;
		if (company_id == null) {
			if (other.company_id != null)
				return false;
		} else if (!company_id.equals(other.company_id))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (license_type_id == null) {
			if (other.license_type_id != null)
				return false;
		} else if (!license_type_id.equals(other.license_type_id))
			return false;
		if (no_of_license_consumed == null) {
			if (other.no_of_license_consumed != null)
				return false;
		} else if (!no_of_license_consumed.equals(other.no_of_license_consumed))
			return false;
		if (no_of_license_issued == null) {
			if (other.no_of_license_issued != null)
				return false;
		} else if (!no_of_license_issued.equals(other.no_of_license_issued))
			return false;
		if (valid_from == null) {
			if (other.valid_from != null)
				return false;
		} else if (!valid_from.equals(other.valid_from))
			return false;
		if (valid_to == null) {
			if (other.valid_to != null)
				return false;
		} else if (!valid_to.equals(other.valid_to))
			return false;
		return true;
	}
}
