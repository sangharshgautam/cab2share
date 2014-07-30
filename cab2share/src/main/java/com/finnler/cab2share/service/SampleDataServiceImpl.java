package com.finnler.cab2share.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class SampleDataServiceImpl implements SampleDataService {

	public Map<String, Object> getSampleData() {
		final Map<String, Object> map = new HashMap<String, Object>();
        map.put("user", "Pavel");
        final List<String> list = new ArrayList<String>();
        list.add("item1");
        list.add("item2");
        list.add("item3");
        map.put("items", list);
		return map;
	}

}
