package IOTextFile;

import java.io.FileWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterInPlaceBufferedWriter {

	public static void main(String[] args) throws IOException {

		FileWriter f = new FileWriter("D:/buff.txt"); 
		
		PrintWriter out = new PrintWriter(f,true);
		
		char[] cArray = {'h','i'};
		out.println(cArray);
		out.println("Shivam");
		out.println("Gupta");
		out.println('H');
		
		out.close();
		f.close();
	
		
		
	}
}
