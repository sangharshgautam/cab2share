package com.finnler.cab2share.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.finnler.cab2share.Vendor;

@Repository
public class VendorDaoImpl extends AbstractBaseDao<Vendor> implements VendorDao {

	public VendorDaoImpl(){
		super(Vendor.class);
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public void create(Vendor vendor) {
		entityManager.persist(vendor);
	}

	public void test(){
		List<Vendor> vendors = super.findAll();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VENDOR");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		for (Vendor vendor : vendors) {
			vendor.getAddress().setCity("Test Update");
		}
		for (Vendor vendor : vendors) {
			em.persist(vendor);
		}
		em.getTransaction().commit();
		em.close();
	}
}
