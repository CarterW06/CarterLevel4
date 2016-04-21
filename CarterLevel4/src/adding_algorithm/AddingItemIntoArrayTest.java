package adding_algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddingItemIntoArrayTest {

	@Test
	public void test() {
		int[] firstValueToTest = {0, 2, 3, 6, 8, 9};
		int[] firstExpectedValue = {0, 2, 3, 4, 6, 8, 9};
		int[] secondExpectedValue = {0, 1, 2, 3, 6, 8, 9};
		assertArrayEquals(firstExpectedValue, AddingItemIntoArray.addItem(firstValueToTest, 4));
		assertArrayEquals(secondExpectedValue, AddingItemIntoArray.addItem(firstValueToTest, 1));
	}

}
