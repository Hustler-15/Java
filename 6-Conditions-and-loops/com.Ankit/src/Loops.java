import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        Syntax for For loop
        for(initialization; condition; increment/decrement){
            body
        }
         */

        // Print numbers from 1 to 5
        for(int num = 1; num<=5; num += 1){
            System.out.println(num);
        }

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=1; i<=num; i+=1)
        {
            System.out.println(i + " ");
        }

        // While Loops
        /*
         Synatx
         while(condition)
         {
            body
         }
         */
        int i = 1;
        while(i<=5)
        {
            System.out.println(i);
            i += 1;
        }

        // Use for loop when you know how many times the loop is going to run and if you don't know then use while loop

        // Do while
        /*
            Syntax:
            do{
                body
            }while(condition)

         */
        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while(n!=1);

        // No matter what is the condition do while loop will execute atleast once

    }
}
