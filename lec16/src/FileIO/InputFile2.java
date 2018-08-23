package FileIO;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class InputFile2 {
	
	public static void main(String [] args) throws IOException{
		
		System.out.println("Enter a file name to be input");
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));//Convert from ASCII to string
		//input a file name and store it in string
		String str=buff.readLine();
		
		try {
			DataInputStream in = new DataInputStream(new FileInputStream(str));
			while(in.available() !=0 ) {
				//print line from a file
				System.out.println(in.readLine());
			}
			in.close();
		}
		catch(Exception e) {
			System.out.println("THis is exception for writing a file");
		}
		
	}

}
