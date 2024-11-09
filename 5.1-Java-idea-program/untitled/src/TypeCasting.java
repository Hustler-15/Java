import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        // Rules for type casting
        // 1) The type should be compaitable
        // 2) The destination type should be greater than source type
        System.out.println(num);

        // Converting higher datatype to lower is called narrowing eg: Float to Integer
        int num1 = (int)(67.56f);
        System.out.println(num1);

        // Automatic type promotion in Expressions
//        int a = 257;
//        byte b = (byte) a;             // Byte can store till 256 so here it will store bcz 257 % 256=1

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = (a*b)/c;
        // The result of a*b exceeds the range of byte to handle this type of problem java automatically promote it to Integer and it only happens in an expression

//        byte b =50;
//        b = b*2                         // Returns error

        int number = 'A';                 // Stores the ASCII value
        System.out.println(A);
    }
}
