package com.finnler.cab2share;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Ride {
	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false, updatable = false)
	private Long id;
	
	@Column(name = "MOBILE", nullable = false, updatable = false)
	private String mobile;
	
	@Column(name = "EMAIL", nullable = false, updatable = false)
	private String email;
	
	@ManyToOne
	private Address from;
	
	@ManyToOne
	private Address to;

	public Ride pick(Address from) {
		this.from = from;
		return this;
	}

	public Ride drop(Address to) {
		this.to = to;
		return this;
	}
}
