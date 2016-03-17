/**
 * 
 */
package com.sei.deduplicate.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.sei.deduplicate.DeDup3;

import junit.framework.TestCase;

/**
 * @author Indu
 *
 */
public class DeDup3Test extends TestCase
{
	/**
	 * Test method for {@link com.sei.deduplicate.DeDup1#deduplicate()}.
	 */
	@Test
	public final void testDeduplicate() {

	    //DeDup3 implementation uses List interface and sorts it. So the result array is in sorted order.
		//Define the expectedResult as a sorted array 
	    int[] expectedResult = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,25,26,34,43,45,85,86,10000};

	    //Invoke the deDuplicate method of DeDup3
	    DeDup3 deDup = new DeDup3();
	    int[] actualResult = deDup.deDuplicate();
	    
	    //Assert that expectedResult array and actualResult array are equal 
	    org.junit.Assert.assertArrayEquals(expectedResult, actualResult);	   
	}
}
