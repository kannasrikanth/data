import java.io.*;
public class CopyFile1 {
public static void main(String args[]) throws IOException
{
FileReader in = null;
FileWriter out = null;
try {
in = new FileReader("input1.txt");
out = new FileWriter("output.txt");
int c;
while ((c = in.read()) != -1) {
out.write(c);
}
}
catch (IOException e){
  System.err.println("File opening failed:");
  e.printStackTrace();
}


finally {
if (in != null) {
in.close();
}
if (out != null) {
out.close();
}
}
}
}

