package Withourusingthirdvariable;

import java.io.File;

public class Gettextfilename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File name =new File("C:\\Users\\GLB-BLR-031\\Documents\\Read.txt");
			String filename = name.getName();
			System.out.println("filename"   +filename);
	}

}
