package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {

	TestExample object = new TestExample();
		boolean output= object.notnullString ("");
		assertEquals(true, output);
		
	}
