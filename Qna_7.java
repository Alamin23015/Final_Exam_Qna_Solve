import java.util.Scanner;
public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter coefficients a, b, and c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double d = (b * b - 4 * a * c);
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / 2;
            double r2 = (-b - Math.sqrt(d)) / 2;
            double res = Math.min(r1, r2);
            System.out.println("The smallest positive root is: " + res);
        } else {
            System.out.println("No real root exist.");
        }
        sc.close();
    }
}
