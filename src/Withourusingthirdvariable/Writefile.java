package Withourusingthirdvariable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Writefile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
          FileOutputStream IO = new FileOutputStream("myfile.txt",true);
          PrintWriter pw = new PrintWriter(IO);
          pw.println("India today new ");
          pw.println("34t5");
          pw.println("wer");
          pw.close();
          
          System.out.println("writing to file ");
          
	}

}
