import java.util.Scanner;

public class Fact {
    static void myFact() {
        Scanner input = new Scanner(System.in); // Don't close System.in Scanner
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        
        int temp = num;
        int factorialSum = 0;

        while (temp > 0) {
            int fact = 1;
            int digit = temp % 10;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            factorialSum += fact;
            temp /= 10;
        }

        System.out.println("Factorial's number sum is: " + factorialSum);

        if (num == factorialSum) {
            System.out.println("Yes, it's a Strong Number.");
        } else {
            System.out.println("No, it's not a Strong Number.");
        }

        input.close(); // Close after use
    }

    public static void main(String[] args) {
        myFact();
    }
}
