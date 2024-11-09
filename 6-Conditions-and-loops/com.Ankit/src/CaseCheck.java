import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        // Here next takes the word  as string
        // trim() removes the extra space
        // charAt(0) it will take element at 0th index and casting will convert it into character
        // We cannot take character directly as input in java

        if (ch >= 'a' && ch <= 'b' )
        {
            System.out.println("LowerCase");
        }
        else{
            System.out.println("UpperCase");
        }
    }
}
