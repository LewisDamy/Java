package application;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        double amount;
        int months;
        double payment;

        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        amount = sc.nextDouble();
        System.out.print("Months: ");
        months = sc.nextInt();

        InterestService service = new BrazilInterestService(2.0);
        payment = service.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        sc.close();
    }
}
