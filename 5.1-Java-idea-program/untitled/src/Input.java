import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int rollno = input.nextInt();
        System.out.println("Your roll no is : " + rollno);

        String name = input.nextLine();        // To get the whole sentence as input
        //String name = input.next();            // To get the first word as input
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);              // Values are not accurate in float we get floating point error



    }
}
