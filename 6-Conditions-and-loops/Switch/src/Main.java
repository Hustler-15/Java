import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String fruits = in.next();

        String a = "Ankit";
        String b = "Ankit";

        // == also checks the reference
        // If we do a==b it means we are checking that a and b both are pointing to the reference of same object
        // So if we just want to compare values we use .equals() method

        // Switch case
        /*
        Syntax:
        switch(expression){
            case one :
                // Do something
                break;
            case two :
                // Do something
                break;
            default :
                // Do something
         */

        // Cases have to be same type as expressions, must be constant or literal
        // duplicate case values are not allowed
        // break is use to terminate the sequence
        // if break is not used it will continue to the next statement
        // default will execute when none of the above is done
        // if default is not there then put break after it

        switch (fruits){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet Red Fruit");
                break;
            case "Orange":
                System.out.println("A Round Fruit");
                break;
            case "Grapes":
                System.out.println("A Small Fruit");
                break;
            default:
                System.out.println("Please enter a valid value");

            // If break is not wriiten then all lines will be executed below it
            // If default statement is last statement then there is no need to write break and if we
            // write it above any case then we need to write break statement

            /*
            Not supported in Java 8
            New Syntax for switch
            switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("please enter a valid fruit");
//        }
             */


        }

    }
}