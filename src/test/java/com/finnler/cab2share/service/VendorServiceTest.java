package com.finnler.cab2share.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.finnler.cab2share.Vendor;
import com.finnler.cab2share.dao.AbstractBaseDaoTest;

public class VendorServiceTest extends AbstractBaseDaoTest{

	@Autowired
	private VendorService vendorService;
	
	@Test(enabled = false)
	public void shouldBeAbleToCreateVendor(){
		vendorService.create(new Vendor().setName("Ram Taxi Service"));
	}
}
