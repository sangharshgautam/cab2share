package com.finnler.cab2share.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class AbstractBaseDao<T> {
	
	private Class<T> clazz;
	
	public AbstractBaseDao(Class<T> clazz) {
		this.clazz = clazz;
	}

	@PersistenceContext(unitName = "finnlerPersistenceUnit")
	protected EntityManager entityManager;

	
	@Transactional(propagation=Propagation.REQUIRED)
	public void create(T vendor) {
		entityManager.persist(vendor);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly= true)
	public List<T> findAll() {
		CriteriaQuery<T> select = createCriteriaQuery();
		select.from(clazz);
		TypedQuery<T> typedQuery = entityManager.createQuery(select);
		return typedQuery.getResultList();
	}
	private CriteriaQuery<T> createCriteriaQuery() {
		CriteriaBuilder criteriaBuilder = getCriteriaBuilder();
		return criteriaBuilder.createQuery(clazz);
	}

	private CriteriaBuilder getCriteriaBuilder() {
		return entityManager.getCriteriaBuilder();
	}
}
