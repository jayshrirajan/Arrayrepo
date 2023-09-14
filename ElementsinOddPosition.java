package Array;

public class ElementsinOddPosition {
	public static void main(String[] args) {
	
	int [] numbers = new int [] {1, 3, 5, 7, 9, 11, 13};

    System.out.println("Array Elements on odd Positions: ");
   
    for (int i = 0; i < numbers.length; i = i+2) {
      System.out.println(numbers[i]);
    }
}

}

//evenposition
//for (int i = 1; i < numbers.length; i = i+2) {