/**
 * 
 */
package com.sei.deduplicate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;

/**
 * @author Indu
 *
 */
public class DeDup3 {
	
    /**
	 * Declare and instantiate randomIntegers array 
	 */
	
    public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
            20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};

    /**
	 * Default constructor
	 */
	public DeDup3() {
	}

	/**
	 * Returns a deDuplicated integer array 
	 * @return      integer array	 * 
	 */
	public int[] deDuplicate(){
	    
		// Creating an ArrayList object from the given randomIntegers int array
		List<Integer> list = Arrays.asList(ArrayUtils.toObject(randomIntegers));
		
		// Sorting the ArrayList elements with natural sorting order (ascending order of numbers)
		Collections.sort(list);
		
		//Define the new deDuped array and its counter
		int[] deDepRandomIntegers = new int[randomIntegers.length];
		int cnt = 0;
		
		//Loop through list till the last but one element, and if each element is not equal to its following element, then put the element into the new deDuped array
		int i = 0;
		for(;i<list.size()-1;i++){
			if(list.get(i).intValue() != list.get(i+1).intValue()){
				deDepRandomIntegers[cnt++] = list.get(i).intValue();  
			}
		}
		//Add the last element of the array
		deDepRandomIntegers[cnt++] = list.get(i).intValue();
		
	    //return a copy of the deDeuped array with only the de-duped elements, without empty array elements. 
	    return Arrays.copyOf(deDepRandomIntegers, cnt);
	   }
}
