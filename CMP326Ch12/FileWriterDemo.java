import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:/pydev/text3.txt", true); // true means appending instead of overwriting
			
			fw.write("\nI found you in another folder \n");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // make sure the file is always closed in the end
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
