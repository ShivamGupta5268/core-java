package IOTextFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderLineByLine {

	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("D:/a.txt");
		
		BufferedReader br = new BufferedReader(reader);
		
		String ch = br.readLine();	//bring line by line String
		
		while(ch != null) {			// returns null end of file
			System.out.print(ch);
			ch = br.readLine();		// Read next line
		}
		br.close();
		reader.close();
		
	}
}
