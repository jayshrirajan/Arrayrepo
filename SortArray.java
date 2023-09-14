package Array;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		//invoking sort() method of the Arrays class  
		Arrays.sort(array);   
		System.out.println("Elements of array sorted in ascending order: ");  
		//prints array using the for loop  
		for (int i = 0; i < array.length; i++)   
		{       
		System.out.println(array[i]);   
		}   
	}

}

//using Collection
//Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};   
////sorts array[] in descending order   
//Arrays.sort(array, Collections.reverseOrder());   
//System.out.println("Array elements in descending order: " +Arrays.toString(array));   