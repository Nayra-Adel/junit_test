package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreditCardUnitTest {

	@Test
	public void test() {
		// fail("Not yet implemented");
		
		// setup
		String ccNumber = "1122334455667788";
		
		// execute
		String result = CreditCard.mask(ccNumber);
		
		// assert
		String expected = "XXXXXXXXXXXX7788";
		assertEquals(expected, result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_nulls() {		
		// setup
		String ccNumber = null;
		
		// execute
		String result = CreditCard.mask(ccNumber);
	}
}
