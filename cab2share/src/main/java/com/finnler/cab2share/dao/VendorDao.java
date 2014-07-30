package com.finnler.cab2share.dao;

import java.util.List;

import com.finnler.cab2share.Vendor;

public interface VendorDao {
	public void create(Vendor vendor);

	public List<Vendor> findAll();
	
	public void test();
}
