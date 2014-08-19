import java.io.*;
public class ReadConsole {
public static void main(String args[]) throws IOException
{
InputStreamReader cin = null;
OutputStream out =null;
try 
{
	cin = new InputStreamReader(System.in);
	out = new FileOutputStream(System.out);
	
	out.println("Enter characters, 'q' to quit.");
		char c;
		do 
		{
			c = (char) cin.read();
			out.write(c);
		} while(c != 'q');
}
catch (IOException e){
  System.err.println("File opening failed:");
  e.printStackTrace();
}
finally 
{
	if (cin != null)
	 {
		cin.close();
	}
}
}
}

