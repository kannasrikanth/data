//package thenumbers;

import java.util.Scanner;

public class TheNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter string1: ");
String string1 = sc.next();
System.out.print("Enter string2: ");
String string2 = sc.next();
if (string1 == string2)    // this will always be false!
    System.out.println("string1 = string2");
else
    System.out.println("string1 not = string2");


    // s.close(); 

    }
}
