package Withourusingthirdvariable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readlinebyline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fil = new FileInputStream("Demo.txt");
			
	      Scanner Sc = new Scanner(fil);
	    while(  Sc.hasNextLine()){
	    	System.out.println(Sc.nextLine());
	    	
	    }
	    Sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}

}
