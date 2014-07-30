package com.finnler.cab2share;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VENDOR")
public class Vendor {
	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false, updatable = false)
	private Long id;

	@Column(name = "NAME", nullable = false, updatable = true)
	private String name;
	
	@OneToOne(optional = false, targetEntity = Address.class, cascade = {CascadeType.ALL})
	@JoinColumn(name = "ADDR_ID")
	private Address address;

	public String getName() {
		return name;
	}

	public Vendor setName(String name) {
		this.name = name;
		return this;
	}

	public Long getId() {
		return id;
	}

	public Vendor setAddress(Address address) {
		this.address = address;
		return this;
	}

	public Address getAddress() {
		return address;
	}

}
