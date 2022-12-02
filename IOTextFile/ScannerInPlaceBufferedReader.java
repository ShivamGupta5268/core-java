package IOTextFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerInPlaceBufferedReader {

	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("D:/a.txt");
		
		Scanner sc = new Scanner(reader);
		
		while(sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		reader.close();
	}
}
