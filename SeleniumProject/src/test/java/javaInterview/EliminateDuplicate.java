package javaInterview;

import java.util.Map;

public class EliminateDuplicate {

	public static void main(String[] args) {
		
		String str = "malayalam";
        char[] x = str.toCharArray();
	
	  StringBuilder sB = new StringBuilder();
	   for(int i=0;i<str.length();i++) {
		boolean flag = false;
		for(int j=i+1;j<x.length;j++) {
			if(x[i] == x[j]) {
				 flag = true;
					break;
		}
		}
			
		if(!flag)	{
			sB.append(x[i]);
		}
			
		}
	
	System.out.println(sB);
	}
	
	
}
	
	
