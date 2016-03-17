/**
 * 
 */
package com.sei.deduplicate.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.sei.deduplicate.DeDup2;

import junit.framework.TestCase;

/**
 * @author Indu
 *
 */
public class DeDup2Test extends TestCase
{
	/**
	 * Test method for {@link com.sei.deduplicate.DeDup1#deduplicate()}.
	 */
	@Test
	public final void testDeduplicate() {
		//Define the expectedResult array
	    int[] expectedResult = {1,2,34,25,45,3,26,85,4,86,43,10000,11,16,19,18,9,
	            20,17,8,15,6,5,10,14,12,13,7};
	    
	    //Invoke the deDuplicate method of DeDup2
	    DeDup2 deDup = new DeDup2();
	    int[] actualResult = deDup.deDuplicate();
	    
	    //DeDup2 implementation maintains the order of the array. 
	    //So we can assert that expectedResult array and actualResult array are equal 
	    org.junit.Assert.assertArrayEquals(expectedResult, actualResult);	   
	}
}
