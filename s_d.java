import java.util.Scanner;
class s_d
{
public static void main(String args[])
{
	 Scanner sc = new Scanner(System.in);

    String name = sc.next();
    int count = sc.nextInt();
    double subtotal = sc.nextDouble();
    String cityName = sc.nextLine();

	System.out.println(name+count+subtotal+cityName);

}
}
