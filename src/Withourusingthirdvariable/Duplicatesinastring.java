package Withourusingthirdvariable;

public class Duplicatesinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "Automation pratices";
     int count=0;
     char string[] = str.toCharArray();
     
     for(int i=0;i<str.length();i++) {
    	for(int j= i+1;j<str.length();j++) {
    		if(string[i]==string[j]) {
    			System.out.println(string[j]);
    			count++;
    			break;
    		}
    	}
     }
     
     
	}

}
