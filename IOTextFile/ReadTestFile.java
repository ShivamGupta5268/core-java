package IOTextFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTestFile {

	public static void main(String[] args) throws IOException {
		
		FileReader f = new FileReader("D:/a.txt");
		
		int ch = f.read();
		while(ch!= -1) {   //end if file -1 no more char is left in file
			char chr = (char) ch;	// TypeCast
			System.out.print(chr);
			ch = f.read();			// Read next character
		}
		f.close();
	}
}
