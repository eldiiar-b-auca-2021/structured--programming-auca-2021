import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double p = inp.nextDouble();
        double k = p * 0.454;

        System.out.printf("%.1f pounds is %.3f kilograms\n",p,k);
    }
}
