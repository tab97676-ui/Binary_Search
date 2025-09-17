package BinarySearchpackage;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesOfBinarySearch {
	private BinarySearch testObject;
	
	@Test
	public void testOf1to10() {
		int[] array1 = {1,2,3,4,5,6,7,8,9,10};
		assertTrue(testObject.binarySearch(array1, 8) == 7);
	}
	
	@Test
	public void testOf1to3() {
		int[] array2 = {1,2,3};
		assertTrue(testObject.binarySearch(array2, 2) == 1);
	}
	
	
}
