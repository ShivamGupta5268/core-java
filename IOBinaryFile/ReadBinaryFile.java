package IOBinaryFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadBinaryFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream in = new FileInputStream("D:/tree.jpg");
		
		FileOutputStream out = new FileOutputStream("D:/rayslogo.jpg");
		
		int ch = in.read();
		while(ch != -1) {
			out.write(ch);
			ch = in.read();
		}
		out.close();
		in.close();
		
	}
}
