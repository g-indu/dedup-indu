/**
 * 
 */
package com.sei.deduplicate;
import java.util.Arrays;

/**
 * @author Indu
 *
 */
public class DeDup1 {

    /**
	 * Declare and instantiate randomIntegers array 
	 */
	
    public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
            20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
    
    /**
	 * Default constructor
	 */
	public DeDup1() {
	}
	
	/**
	 * Returns a deDuplicated integer array 
	 * @return      integer array	 * 
	 */
	public int[] deDuplicate(){
	    
		//Creates a new unique array with length of randomIntegers array
	    int[] uniqueArr = new int[randomIntegers.length];
	    int cnt = 0;
	    
	    /*Loop through randomIntegers array. 
	     * For each element in randomIntegers, we loop through the new unique array to check if the element exists.
	     * If not, then add the element to the new unique array.
	     */
	    for (int i = 0; i < randomIntegers.length; i++) {
	        boolean found =false;
	        for (int j = 0; j < cnt; j++) {
	            if (randomIntegers[i] == uniqueArr[j]) {                  
	                found = true;
	            }
	        }
	        if(!found){
	            uniqueArr[cnt++] = randomIntegers[i];
	        }
	    }
	    
	    //return a copy of the new unique array with only the de-duped elements, without empty array elements. 
	    return Arrays.copyOf(uniqueArr, cnt);
	   }
}
