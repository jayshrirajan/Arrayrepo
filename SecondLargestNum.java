package Array;

public class SecondLargestNum {
	public static int getSecondLargest(int[] a,int total) {
		int temp;
		
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		return a[total-2];                //ThirdLargest(return a[total-3])
		}
		public static void main(String[] args) {
			int a[]= {1,2,4,4};
			int b[]= {34,56,-67,90};
			System.out.println(getSecondLargest(a,4));
			System.out.println(getSecondLargest(b,4));
		
	}

}



//using collections
//import java.util.*;  
//public class SecondLargestInArrayExample2{  
//public static int getSecondLargest(Integer[] a, int total){  
//List<Integer> list=Arrays.asList(a);  
//Collections.sort(list);  
//int element=list.get(total-2);  
//return element;  
//}  
//public static void main(String args[]){  
//Integer a[]={1,2,5,6,3,2};  
//Integer b[]={44,66,99,77,33,22,55};  
//System.out.println("Second Largest: "+getSecondLargest(a,6));  
//System.out.println("Second Largest: "+getSecondLargest(b,7));  
//}}  


