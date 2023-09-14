//left

package Array;

public class RotateElements {
	public static void main(String[] args) {
		int [] numbers = new int [] {2, 4, 6, 8, 10, 12};
	    
	    int n = 2;
	    System.out.println("Given array is: ");
	    for (int i = 0; i < numbers.length; i++) {
	      System.out.print(numbers[i] + " ");
	    }
	    //Left rotate the array by n times
	    for(int i = 0; i < n; i++){
	      int j, firstElement;
	      firstElement = numbers[0];
	      for(j = 0; j < numbers.length-1; j++){
	        
	        numbers[j] = numbers[j+1];
	      }
	      
	      numbers[j] = firstElement;
	    }
	    System.out.println();
	    //Printing output array
	    System.out.println("Array after "+n+" left rotations: ");
	    for(int i = 0; i< numbers.length; i++){
	      System.out.print(numbers[i] + " ");
	    }
	}

}

//Right
//class JavaExample {
//	  public static void main(String[] args) {
//	    //Initializing the array numbers
//	    int [] numbers = new int [] {11, 22, 33, 44, 55, 66};
//	    /* This number specifies how many times the array needs
//	     * to be right rotated.
//	     */
//	    int n = 2;
//	    System.out.println("Given array is: ");
//	    for (int i = 0; i < numbers.length; i++) {
//	      System.out.print(numbers[i] + " ");
//	    }
//	    //Right rotate the array by n times
//	    for(int i = 0; i < n; i++){
//	      int j, lastElement;
//	      //Storing the last element of the array to move to start
//	      lastElement = numbers[numbers.length-1];
//	      for(j = numbers.length-1; j > 0; j--){
//	        //Shifting the element to right by 1 on each iteration of loop
//	        numbers[j] = numbers[j-1];
//	      }
//	      //Adding the last element at the beginning of the array
//	      numbers[0] = lastElement;
//	    }
//	    System.out.println();
//	    //Printing output array
//	    System.out.println("Array after "+n+" right rotations: ");
//	    for(int i = 0; i< numbers.length; i++){
//	      System.out.print(numbers[i] + " ");
//	    }
//	  }
//	}  
