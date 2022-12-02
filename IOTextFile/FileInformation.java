package IOTextFile;

import java.io.File;

public class FileInformation {
	
	public static void main(String[] args) {
		
		// Create Object of file
		
		File f = new File("D:/movie/ab.txt");
		
		if(f.exists()) {			  // create if file exists
			System.out.println(f.getName());	//Name of file
		}else {
			System.out.println("Not exist");
			}
		
		System.out.println(f.getAbsolutePath());//Path of file
		System.out.println(f.canWrite());		// Writable
		System.out.println(f.canRead());		// Readable
		
		// check it is directory or file
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
		System.out.println(f.lastModified());
		System.out.println(f.length());		//Length of file
	}

}
