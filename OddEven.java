package Array;

public class OddEven {
	public static void main(String[] args) {
		int a[] = {2,3,4,5,6};
		System.out.println("Odd number");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Even number");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
		
	}
		}
	}
}
