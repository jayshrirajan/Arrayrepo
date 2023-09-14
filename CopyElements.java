package Array;

public class CopyElements {
	public static void main(String[] args) {
	    
	    int [] firstArray = new int [] {3, 5, 7, 9, 11};
	   
	    int secondArray[] = new int[firstArray.length];

	    System.out.println("Elements of First array: ");
	    for (int i = 0; i < firstArray.length; i++) {
	      System.out.print(firstArray[i] + " ");
	    }

	  
	    for (int i = 0; i < firstArray.length; i++) {
	      secondArray[i] = firstArray[i];
	    }

	    //Displaying elements of secondArray
	    System.out.println();
	    System.out.println("Elements of Copied array: ");
	    for (int i = 0; i < secondArray.length; i++) {
	      System.out.print(secondArray[i] + " ");
	    }
	  }

}
