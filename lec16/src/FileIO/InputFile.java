package FileIO;
import java.io.*;

public class InputFile {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a file name");
		String str = br.readLine();
		try {
			FileInputStream fstream = new FileInputStream(str);
			DataInputStream in = new DataInputStream(fstream);
			//continue to read lines
			while(in.available()!=0) {
				//print file line to screen
				System.out.println(in.readLine());
				
			}
			in.close();
		}
		catch(IOException e) {
			System.out.println("Cannot read file");
		}
		

	}

}
