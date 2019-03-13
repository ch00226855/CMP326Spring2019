import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		FileReader fr = null; 
		try {
			fr = new FileReader("Scores.txt");
			
			int charRead = fr.read();
			
			System.out.print((char)charRead);
			
			charRead = fr.read();
			
			while(charRead != -1) {// there exists another character
				System.out.print((char)charRead);
				charRead = fr.read();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
