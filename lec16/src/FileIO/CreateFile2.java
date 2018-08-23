package FileIO;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class CreateFile2 {
	
	public static void main(String [] args) throws IOException{
		//Create a file and write something to it.
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the file name to be created");
		String str = buff.readLine();
		
		FileOutputStream out;
		PrintStream p;
		try {
			out = new FileOutputStream(str);
			System.out.println("A file : "+str+"has been created");
			//Connect print stream to output
			p = new PrintStream(out);
			p.println("I love Van!!");
			p.close();
		}
		catch(Exception e) {
			System.out.println("File contains input output error");
		}
		
		
	}

}
