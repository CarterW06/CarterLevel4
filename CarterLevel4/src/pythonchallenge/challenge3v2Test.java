package pythonchallenge;

import static org.junit.Assert.*;

import org.junit.Test;

public class challenge3v2Test {
	
	Challenge3v2 challenge3 = new Challenge3v2();
	
	@Test
	public void test() {
		assertTrue(challenge3.isBodyguarded("WDZjUZM"));
	}

}
