import java.util.*;

public class Income_Tax_Calculator_3_5 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int income = sc.nextInt();
            int tax;
            if (income <= 500000) {
                tax = 0;
            }
            else if (income >= 500000 && income <= 1000000) {
                tax = (int) ((income - 500000) * 0.2);
            }
            else {
                tax = (int)(500000 * 0.2) + (int)((income-1000000) * 0.3);
            }
            System.out.println("Total tax is:" + tax);
        }
    }
}