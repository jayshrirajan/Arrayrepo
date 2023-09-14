//package Array;
//
//public class numelements {
//	
//	public static void main(String[] args) {
//		
//		int [] numbers= new int[] {10,9,7,30};
//		System.out.println("given number array"+numbers.length);
//		
//		
//		String [] names = new String[] {"steve","luna","hina"};		
//	System.out.println("given name array"+names.length);
//	}
//}

//largestelement(arr[i]>)  //smallestelement(arr[i]<)
//package Array;
//
//public class numelements {
//	
//	public static void main(String[] args) {
//		int [] arr=new int[] {10,89,100,2};
//		int largestelement = arr[0];
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<largestelement) 
//				largestelement=arr[i];
//				}
//	System.out.println("largest element"+largestelement);
//	}}
	


//findduplicateelements
//package Array;
//
//public class numelements {
//	
//	public static void main(String[] args) {
//		int[] numbers= new int[] {10,34,50,34,50,90};
//		
//		System.out.println("Duplicate Element");
//		
//		for(int i=0; i<numbers.length;i++) {
//			for(int j=i+1; j<numbers.length;j++) {
//				if(numbers[i]==numbers[j]);
//				
//				System.out.println(numbers[j]);
//			}
//		}
//		
//	}}
	
//removeduplicates
package Array;

public class numelements {
	
    public static int removeDuplicateElements(int arr[], int n){  

        if (n==0 || n==1){  

            return n;  

        }    

        int j = 0;//for next element  

        for (int i=0; i < n-1; i++){  

            if (arr[i] != arr[i+1]){  

                arr[j++] = arr[i];  

            }  

        }  

//remove duplicates from array java

        arr[j++] = arr[n-1];  

        return j;  

    }
	public static void main(String[] args) {
		int arr[] = {10,20,20,30,30,40,50,50};  

        int length = arr.length;  

        length = removeDuplicateElements(arr, length);  

        //printing array elements  

        for (int i=0; i<length; i++)  

           System.out.print(arr[i]+ " ");  
		
	}}
	


