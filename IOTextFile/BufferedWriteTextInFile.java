package IOTextFile;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteTextInFile {

	public static void main(String[] args) throws IOException {

		FileWriter f = new FileWriter("D:/buff.txt"); 
		
		BufferedWriter bw = new BufferedWriter(f);
		
		char[] cArray = {'h','i'};
		bw.write(cArray);
		bw.write("Shivam");
		bw.write("Gupta");
		bw.write('H');
		
		bw.close();
		f.close();
	}
}
