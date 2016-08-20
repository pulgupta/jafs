package com.example.jafs.dao.impl;

import org.springframework.stereotype.Repository;

import com.example.jafs.dao.DataManipulation;
import com.example.jafs.entity.Endpoint;

/**
 * The class contains the DAO functions like
 * add
 * list
 * edit(include delete as well)
 * end-points in the persistent storage. To start with our .py file will be 
 * considered as a persistent storage. All the sample JSON files will be saved 
 * Separately
 * @author pulgupta
 *
 */
@Repository
public class FileDataManipulation implements DataManipulation {

	@Override
	public boolean addEndpoint(Endpoint endpoint) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean listEndpoint(Endpoint endpoint) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editEndpoint(Endpoint endpoint) {
		// TODO Auto-generated method stub
		return false;
	}

}
