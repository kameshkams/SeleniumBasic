package javaInterview;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		
		
		String str = "K@ame$shw@aran";
		
		String removed = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(removed);
		
		

	}

}
