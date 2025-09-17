package BinarySearchpackage;

import java.util.Arrays;

public class BinarySearch {

	public int binarySearch(int[] array, int target) {
	    int mid = array.length / 2;
	    int i = 0;
	
//	    for (k = 0; k < array.length; k++) {
	   
	        if (mid == target) {
	            return mid-1;
	        } else if (mid > target) {
//	        	int[] arr1;
//	        	for (int k = 0; k < (array.length/2); k++) {
//	        		arr1[k] = array[k];
//	        	}
	        	
	        	int[] arr = Arrays.copyOfRange(array,  mid,  0);
	            binarySearch(arr, target);
	            
	        } else if (mid < target) {
//	        	int[] arr;
//	        	for (int k = (array.length/2); k< array.length ; k++) {
//	        		arr[k-(array.length/2)] = array[k];
//	        	}
	        	int[] arr = Arrays.copyOfRange(array,  mid,  mid);
	            binarySearch(arr, target);
	            
	        }
//	    }
	
	    return -1;
	}
}
