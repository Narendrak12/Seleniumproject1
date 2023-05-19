package Withourusingthirdvariable;

import java.util.Scanner;

public class Stringwithout3rdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the value of x and y");  
       Scanner sc = new Scanner(System.in);
       int x= sc.nextInt();
       int y=sc.nextInt();
       System.out.println("before swaping numbers"+x+"  "+y);
      // System.out.println("hello world");
       x=x+y;
       y=x-y;
       x=x-y;
       System.out.println("after swaping number"+x+"  "+y);
        
	}

}
