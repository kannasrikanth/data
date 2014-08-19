
import java.lang.*;
import java.*;

public class string_demo
{

public static void main(String args[])
{
String name="srisri";
String copy_name=new String(name);
copy_name=copy_name.concat(name);

System.out.println(name+"\n"+copy_name+name.length()+name.charAt(3)+name.compareTo(copy_name));
}

}
