package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase01 {

	@Test
	public void test() {
		TestExample object = new TextExample();
		
		boolean output= object.isValid();
		
		assertEquals(true, output );
				
	}

}
