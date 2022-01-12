package array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTestCase {

	@Test
	void test1() {

		int arr[] = {2,4,6,9};
		int arr2[] = {1,0,2};
		assertEquals("9642", Largest_Possible_No.findLargest(arr));
		assertEquals("210", Largest_Possible_No.findLargest(arr2));
	}

}
