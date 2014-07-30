package com.finnler.cab2share.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.finnler.cab2share.Address;
import com.finnler.cab2share.States;
import com.finnler.cab2share.Vendor;
import com.finnler.cab2share.service.Country;

public class VendorDaoTest extends AbstractBaseDaoTest {
	@Autowired
	private VendorDao vendorDao;
	
	@Test
	public void shouldFindAllVendors(){
		List<Vendor> vendors = vendorDao.findAll();
		assertTrue(vendors.size() == 1);
	}
	
	@Test
	public void shouldBeAbleToCreateVendor() {
		int initial = vendorDao.findAll().size();
		Vendor vendor = new Vendor().setName("Ram Taxi Service").setAddress(new Address().setCity(
				"Ghaziabad").setState(States.UTTAR_PRADESH).setCountry(Country.INDIA));
		vendorDao.create(vendor);
		 assertNotNull(vendor.getId());
		assertTrue(vendorDao.findAll().size() == initial + 1);
	}
	
	
}
