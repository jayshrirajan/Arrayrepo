

package Array;

import java.util.Scanner;

public class SortAcesending {
	
	public static void main(String[] args) {
		
		int count,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		count=s.nextInt();
		
		int[] num=new int[count];
		System.out.println("Enter the array");
		for(int i=0;i<count;i++) {
			num[i]=s.nextInt();
		}
		s.close();
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < count - 1; i++) 
        {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[count - 1]);
		
	}

}
