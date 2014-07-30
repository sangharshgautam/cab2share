package com.finnler.cab2share.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.finnler.cab2share.Address;
import com.finnler.cab2share.Ride;
import com.finnler.cab2share.States;
import com.finnler.cab2share.service.Country;


public class RideDaoTest extends AbstractBaseDaoTest{

	@Autowired
	private RideDao rideDao;
	
	@Test
	public void shouldCreateMultipleRideFromAndToSameAddress(){
		Address from = new Address().setCity("NOIDA").setCountry(Country.INDIA).setState(States.UTTAR_PRADESH);
		Address to = new Address().setCity("NOIDA").setCountry(Country.INDIA).setState(States.UTTAR_PRADESH);
		
		for (int i = 0; i < 10; i++) {
			Ride ride = new Ride().pick(from).drop(to);
			rideDao.create(ride);
		}
	}
}
