package com.finnler.cab2share.dao;

import java.util.List;

public interface BaseDao<T> {
	public void create(T vendor);
	
	public List<T> findAll();
}
