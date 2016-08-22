package com.example.jafs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.jafs.dao.impl.FileDataManipulation;
import com.example.jafs.entity.Endpoint;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JafsApplicationTests {

	@Test
	public void fileAddEnpointSuccess() {
		Endpoint ep = new Endpoint();
		ep.setEndpointUrl("adb");
		FileDataManipulation fd = new FileDataManipulation();
		assertEquals(fd.addEndpoint(ep), true);
	}

}
