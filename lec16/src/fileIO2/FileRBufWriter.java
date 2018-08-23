import java.io.*;

public class FileRBufWriter
{
	public static void main(String args[])
	{
	String r;
	try
	{
		BufferedReader in = new BufferedReader(new FileReader("NewDevFile.txt"));
		r =  in.readLine();
		System.out.println(r);
	}
	catch(IOException e)
	{}
	}
}