package com.example.jafs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jafs.dao.DataManipulation;
import com.example.jafs.entity.Endpoint;

@Service
public class EndpointService {

	@Autowired
	private DataManipulation dm;
	
	public boolean addEndpoint(Endpoint ep){
		try {
			return dm.addEndpoint(ep);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean listEndpoint(Endpoint ep){
		try {
			return dm.listEndpoint(ep);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean editEndpoint(Endpoint ep){
		try {
			return dm.editEndpoint(ep);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
