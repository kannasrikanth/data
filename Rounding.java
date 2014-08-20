//package rounding;
import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rounding {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        // perform rounding until user says "N":
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            System.out.print("Enter a foating point value: ");
            // The following IS INCORRECT way of populating the BigDecimal:
            //double value = sc.nextDouble();
            //BigDecimal bdValue = new BigDecimal(value);
            
            // The INCORRECT way of populating BigDecimal is:
            String strValue = sc.next();
            double value = Double.parseDouble( strValue );
            BigDecimal bdValue = new BigDecimal(strValue);
            
            BigDecimal bdHalfUp = bdValue.setScale(2, RoundingMode.HALF_UP);
            BigDecimal bdHalfEven = bdValue.setScale(2, RoundingMode.HALF_EVEN);

            System.out.println("     double value: " + value);
            System.out.println("       BigDecimal: " + bdValue);
            System.out.println("  Rounded HALF_UP: " + bdHalfUp);
            System.out.println("Rounded HALF_EVEN: " + bdHalfEven);

            System.out.print("Continue? (y/n): ");
            sc.nextLine();
            choice = sc.next();
            System.out.println();
        }
           
    }//main
}//class Rounding

