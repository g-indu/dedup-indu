/**
 * 
 */
package com.sei.deduplicate;

import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.commons.lang.ArrayUtils;

/**
 * @author Indu
 *
 */
public class DeDup2 {
	
    /**
	 * Declare and instantiate randomIntegers array 
	 */
	
    public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
            20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};

    /**
	 * Default constructor
	 */
	public DeDup2() {
	}

	/**
	 * Returns a deDuplicated integer array 
	 * @return      integer array	 * 
	 */
	public int[] deDuplicate(){
	    
		/* Creating a Set object from the given randomIntegers int array
		  This will remove all duplicates, as Set does not allow duplicate elements.
		 */
	    Set<Integer> set = new LinkedHashSet<Integer>();
	    for (int i=0;i<randomIntegers.length;i++) {
	           set.add(randomIntegers[i]);
	        }
	    
	    //Converts the Set to Integer array and then to int array.
	    //return deDuplicated int array. 
	    return ArrayUtils.toPrimitive(set.toArray(new Integer[set.size()]));
	   }
}
