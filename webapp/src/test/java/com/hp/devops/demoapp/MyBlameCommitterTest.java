package com.hp.devops.demoapp;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.Random;

public class MyBlameCommitterTest {

	private static Random rand;
	private static int randomNumber;

	@Before
	public void beforeEach() {
		rand = new Random();
		randomNumber = rand.nextInt(3);
	}


	@Test
	public void throwsExceptionTestA() {
		if (randomNumber == 0) {
			Band band = new Band(null);
			band.throwsExceptionMethod();
		}
        //Assert.assertEquals(true, false);
	}

	@Test
	public void throwsExceptionTestB() {
		if (randomNumber == 1) {
			Band band = new Band(null);
			band.throwsExceptionMethod();
		}
        //Assert.assertEquals(true, false);
	}
	@Test
	public void throwsExceptionTestC() {
		if (randomNumber == 2) {
			Band band = new Band(null);
			band.throwsExceptionMethod();
		}
        //Assert.assertEquals(true, false);
	}

}