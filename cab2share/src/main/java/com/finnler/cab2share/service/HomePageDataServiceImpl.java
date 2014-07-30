package com.finnler.cab2share.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HomePageDataServiceImpl implements HomePageDataService{

	public List<String> getHeaders() {
		List<String> headers = new ArrayList<String>();
		headers.add("Home");
		headers.add("About");
		headers.add("Contact");
		headers.add("Login");
		return headers;
	}

}
