package Withourusingthirdvariable;

public class ReverseString {

	public static void main(String[] args) {
		
		String str= "New building ";
		
		StringBuilder sb= new StringBuilder(str);
		
		sb.reverse();
		System.out.println(sb);

	}

}
