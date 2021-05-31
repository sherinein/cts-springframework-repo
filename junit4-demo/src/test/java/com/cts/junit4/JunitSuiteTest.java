package com.cts.junit4;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.cts.junit4.service.LoginServiceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CalculatorTest.class,
	LoginServiceTest.class
})
public class JunitSuiteTest {

	
}
