package com.example.jafs.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jafs.entity.Endpoint;
import com.example.jafs.service.EndpointService;

/**
 * All the data services are provided as a RESTful service.
 * @author pulgupta
 * @version 1.0.0.0
 */
@RestController
public class EndpointControllers {
	
	Logger logger = LoggerFactory.getLogger(EndpointControllers.class);
	
	@Autowired
	private EndpointService es;
	
	@RequestMapping(value = "/endpoint", method=POST, consumes="application/json", produces="application/json")
	public ResponseEntity<String> addEndpoint(@RequestBody Endpoint ep) {
		es.addEndpoint(ep);
		logger.info(ep.toString());
		ResponseEntity<String> re = new ResponseEntity<>(ep.getEndpointUrl(), HttpStatus.OK);
		return re;
	}
	
	@RequestMapping(value = "/endpoint", method=GET, consumes="application/json", produces="application/json")
	public ResponseEntity<String> listEndpoint(@RequestBody Endpoint ep) {
		es.listEndpoint(ep);
		logger.info(ep.toString());
		ResponseEntity<String> re = new ResponseEntity<>(ep.getEndpointUrl(), HttpStatus.OK);
		return re;
	}
	
	@RequestMapping(value = "/endpoint",method=PUT, consumes="application/json", produces="application/json")
	public ResponseEntity<String> updateEndpoint(@RequestBody Endpoint ep) {
		es.editEndpoint(ep);
		logger.info(ep.toString());
		ResponseEntity<String> re = new ResponseEntity<>(ep.getEndpointUrl(), HttpStatus.OK);
		return re;
	}
}
