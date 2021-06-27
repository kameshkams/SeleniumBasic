package javaInterview;

public class ReverseString {

	public static void main(String[] args) {


		String str = "123456789";
		
		 int length =str.length();
		 
		 System.out.println(length);
		 
		char arr[] = str.toCharArray();
		
		for(int i=arr.length-1; i>=0; i--) {
			
			System.out.print(arr[i]);
		}
		
		
		
		

	}

}
