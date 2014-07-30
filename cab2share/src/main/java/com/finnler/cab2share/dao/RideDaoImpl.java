package com.finnler.cab2share.dao;

import org.springframework.stereotype.Repository;

import com.finnler.cab2share.Ride;

@Repository
public class RideDaoImpl extends AbstractBaseDao<Ride> implements RideDao {

	public RideDaoImpl(){
		super(Ride.class);
	}
}
