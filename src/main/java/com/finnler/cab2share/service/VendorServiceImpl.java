package com.finnler.cab2share.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finnler.cab2share.Vendor;
import com.finnler.cab2share.dao.VendorDao;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorDao vendorDao;
	
	public void create(Vendor vendor) {
		vendorDao.create(vendor);
	}

	public List<Vendor> findAll() {
		return vendorDao.findAll();
	}

}
