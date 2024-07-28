package test;

import static org.junit.Assert.*;

import org.junit.Test;

import TestExample.TestExample;

public class testttt {

	@Test
	public void test() {
		
		TestExample object = new TestExample();
		
		int output= object.Sum(4, 4);
		
		assertEquals(8, output );
		
	
	}

}
