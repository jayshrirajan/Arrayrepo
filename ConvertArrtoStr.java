package Array;

public class ConvertArrtoStr {
	
	public static void main(String[] args) {
		char[] ch= {'h','e','l','l','0',' ','w','o','r','l','d'};
		String str=new String(ch);
		System.out.println(str);
		
		String str1=String.valueOf(ch);
		System.out.println(str1);
	}

}
