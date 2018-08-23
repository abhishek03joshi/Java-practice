import java.io.*;

public class FileOutputDemo
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("File create and Write Example.");
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter File name!");
		String str = buff.readLine();
		
		FileOutputStream out;
		PrintStream p;
		try
		{
			//Create a new file output Stream
		
			out = new FileOutputStream(str);
			System.out.println("File has been created.");
			//Connect print stream to the Output stream
			p = new PrintStream(out);
			p.println("This is written to a file");
			p.close();
		
		}
		catch(Exception e)
		{
			System.out.println("Error writing to file");
		}
	}

}