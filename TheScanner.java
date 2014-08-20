import java.util.Scanner;
public class TheScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        
        System.out.println( "Hello! Enter a number:" );
        int aNumber = sc.nextInt();

        System.out.println( "You entered " + aNumber );

        // Two ways to get text data from the Scanner:

        // (1)
        // next() -- gives next tokem with no spaces
        System.out.println( "What is your name?" );
        String userName = sc.next();
        // Note: any white space in front was discarded!
        System.out.println( "You entered " + userName );

        // (2)
        // nextLine() -- reads remaining line and CR+LF at the end of line.
        // CR+LF is thrown out and not returned:
        String userPassword = sc.nextLine();
        // Note: any white space in front is preserved:
        System.out.println( "You entered " + userPassword );
    }
}

