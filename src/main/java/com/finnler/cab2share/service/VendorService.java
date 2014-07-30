package com.finnler.cab2share.service;

import java.util.List;

import com.finnler.cab2share.Vendor;

public interface VendorService {
	public void create(Vendor vendor);

	public List<Vendor> findAll();
}
