package Duplicatevalue;

public class reversethestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Hello";
		char chars[]= str.toCharArray();
		
		for(int i= str.length()-1;i>=0;i--) {
			
			System.out.print(chars[i]);
			
		}
		System.out.println(str.length());
	}

}
