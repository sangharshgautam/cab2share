package com.finnler.cab2share;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.finnler.cab2share.service.Country;

@Entity
@Table(name = "ADDRESS")
public class Address {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "CITY", length = 100)
	private String city;
	
	@Column(name = "STATE", length = 100)
	@Enumerated(EnumType.STRING)
	private States state;
	
	@Column(name = "COUNTRY", length = 100)
	@Enumerated(EnumType.STRING)
	private Country country;

	public String getCity() {
		return city;
	}

	public Address setCity(String city) {
		this.city = city;
		return this;
	}

	public Address setState(States state) {
		this.state = state;
		return this;
	}

	public Address setCountry(Country country) {
		this.country = country;
		return this;
	}
}
