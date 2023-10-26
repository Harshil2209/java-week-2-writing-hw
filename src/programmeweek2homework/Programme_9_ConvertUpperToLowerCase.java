package programmeweek2homework;

import java.util.Scanner;

/**
 * Write a programme to convert the upper case to lower case.
 */

public class Programme_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the upper String : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUppercaseToLowerCase(uppercase);
        //closing the scanner object
    }

    //conversion of Uppercase to lower case method
    public void convertUppercaseToLowerCase(String text){
        System.out.println("THe Lowercase value is = " + text.toLowerCase());
    }

}
