import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileIODemo {

	public static void main(String[] args) {
		
		// To write something in a file, we need:
		// 1) A FileOutputStream
		// 2) A PrintWriter
		
		FileOutputStream file = null;
		try {
			file = new FileOutputStream("Student scores.txt");
		} catch (Exception e) {
			System.out.println("Ooops! Error occured during file handling.");
			System.out.println(e.getMessage()); // prints error message
			e.printStackTrace(); // prints the stack trace to help programmer locate the error.
		}
		
		
		PrintWriter pw = new PrintWriter(file);
		
		// To write content to a file, do the following:
		// 1) use print() to push text to computer memory
		// 2) use flush() to flush the buffer (here the contents are actually written to the file)
		// 3) use close() to close the file and the PrintWriter.
		
		pw.println("Adam: 100");
		pw.println("Bob: 95");
		pw.println("Clare: 90");
		pw.flush();
		
		try {
			file.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		pw.close();
		
		
		
		System.out.println("Sentence has been written to file.");

	}

}
