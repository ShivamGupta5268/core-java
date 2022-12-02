package IOTextFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextInFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter w = new FileWriter("D:/write.txt",true);
									// true for Append
		w.write('A');
		w.write(" Book");
		w.write(" costs");
		w.write(" is ");
		w.write(5);
		
		w.close();
	}
}
