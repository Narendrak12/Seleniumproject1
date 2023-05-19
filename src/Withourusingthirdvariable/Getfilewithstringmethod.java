package Withourusingthirdvariable;

import java.io.File;

public class Getfilewithstringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath ="C:\\Users\\GLB-BLR-031\\Documents\\Read.txt";
		
		int index = filepath.lastIndexOf("\\");
	//	System.out.println(index-1);
		String file = filepath.substring(index+1);
         System.out.println(file);
		
	}

}
