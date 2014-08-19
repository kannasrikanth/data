import java.util.Scanner;

public class scanner
{
    public static void main (String[]args)
    {
        String f;

        Scanner input = new Scanner (System.in);

        System.out.print("Enter First multiple");
        f = input.nextLine();

        System.out.println ("Enter second multiple");
       int  s = input.nextInt();
String a=input.nextString();

      //  sum = number1 * number2;

        System.out.printf (f+s);
    }
}
