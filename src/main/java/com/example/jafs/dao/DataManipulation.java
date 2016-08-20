package com.example.jafs.dao;

import com.example.jafs.entity.Endpoint;

/**
 * The class contains the DAO functions like
 * add
 * list
 * edit (includes delete as well)
 * end-points in the persistent storage. We can have multiple 
 * implementations of the interface based on the persistent storage we opt for.
 * @author pulgupta
 *
 */
public interface DataManipulation {
	
	public boolean addEndpoint(Endpoint endpoint);
	public boolean listEndpoint(Endpoint endpoint);
	public boolean editEndpoint(Endpoint endpoint);
	
	

}
