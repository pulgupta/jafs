package com.example.jafs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jafs.dao.DataManipulation;
import com.example.jafs.entity.Endpoint;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * All the data services are provided as a RESTful service.
 * @author pulgupta
 * @version 1.0.0.0
 */
@RestController
public class RestControllers {
	
	@Autowired
	private DataManipulation dm;
	
	@RequestMapping(value = "/endpoint", method=POST, consumes="application/json", produces="application/json")
	public ResponseEntity<HttpStatus> addEndpoint(@RequestBody Endpoint ep) {
		dm.addEndpoint(ep);
		return null;
	}
	
	@RequestMapping(value = "/endpoint", method=GET, consumes="application/json", produces="application/json")
	public ResponseEntity<HttpStatus> listEndpoint(@RequestBody Endpoint ep) {
		dm.listEndpoint(ep);
		return null;
	}
	
	@RequestMapping(value = "/endpoint",method=PUT, consumes="application/json", produces="application/json")
	public ResponseEntity<HttpStatus> updateEndpoint(@RequestBody Endpoint ep) {
		dm.editEndpoint(ep);
		return null;
	}
}
