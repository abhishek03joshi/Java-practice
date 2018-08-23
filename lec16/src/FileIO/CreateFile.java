package FileIO;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class CreateFile {
	
	public static void main (String [] args) throws IOException {
		System.out.println("Create file and write example");
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the file name");
		String str=buff.readLine();
		
		FileOutputStream out;
		PrintStream p;
		try {
			//Create a new file Output stream
			out = new FileOutputStream(str);
			System.out.println("File has been created");
			//Connect print stream to output
			p=new PrintStream(out);
			p.println("Van Anh is beautiful. She is my bae");
			p.close();
		}
		catch(Exception e) {
			System.out.println("File contains input output error");
		}
		
	}

}
