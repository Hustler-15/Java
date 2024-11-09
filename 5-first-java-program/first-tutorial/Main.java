
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {      
        // Here main function is the entry point of our program and we want to access it without creating the object so we use static. So if  we want access function and variables of a class without creating its object we use static
        // Void is the return type of the function
        // args basically stores command line arguments means the value which we pass on terminal with (java filename "Ankit" 22
        // if we print the output args[0] -> Ankit, args[1] -> 22, args -> Ankit 22

        System.out.print("Hello World!");
        System.out.println("Hello World!");

        // -> System is the class in java.lang
        // -> out is the variable of printStream class
        // -> Methoud of printStream class Println is the function to print string 
        // -> we use only print() then it won't add new line and println() adds new line

        // For input we have Scanner class its available in java.util package
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());
        // Here in Scanner() means from where we are passing the input. To get input from keyboard we use "System.in" 
        // -> System is the class and "in" is the object of inputStream class

    }
}