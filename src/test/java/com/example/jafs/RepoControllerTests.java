package com.example.jafs;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.jafs.controllers.RepoController;
import com.example.jafs.entity.Repository;

import static org.junit.Assert.*;

import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepoControllerTests {

	@Test
	public void fileCreatedAndCopied() {
		Repository repo = new Repository();
		repo.setEndpointUrl("/Users/pulgupta/Documents/archives");
		RepoController rc = new RepoController();
		ResponseEntity<String> re = rc.setRepo(repo);
		assertEquals(HttpStatus.OK, re.getStatusCode());
	}
	
}
