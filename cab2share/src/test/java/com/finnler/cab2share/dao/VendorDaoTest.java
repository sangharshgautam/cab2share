package com.finnler.cab2share.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import com.finnler.cab2share.Address;
import com.finnler.cab2share.States;
import com.finnler.cab2share.Vendor;
import com.finnler.cab2share.service.Country;

@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@TestExecutionListeners({ TransactionalTestExecutionListener.class })
@Transactional
public class VendorDaoTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	private VendorDao vendorDao;

/*	@Before
	public void setUp(){
		for(int i =0;i<10000;i++){
			Vendor vendor = new Vendor().setName("Ram Taxi Service").setAddress(new Address().setCity(
					"Ghaziabad").setState(States.UTTAR_PRADESH).setCountry(Country.INDIA));
			vendorDao.create(vendor);	
		}
		
	} */
	
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
