public class CountNums {
    public static void main(String[] args) {
        int n = 45336;

        int count = 0;
        while(n > 0)
        {
            int digit = n%10;
            if (digit == 5)
            {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
