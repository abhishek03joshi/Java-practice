import java.io.*;

public class FileInputDemo
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter File Name!");
		String str = br.readLine();
		try
		{
			FileInputStream fstream  = new FileInputStream(str);
	
			DataInputStream in = new DataInputStream(fstream);
			//continue to read lines while

			while(in.available()!=0)
			{
				//print file line to screen
				System.out.println(in.readLine());
			}
			in.close();
		}
		catch(Exception e)
		{
			System.err.println("File input error");
		}
	}

}