package main;


import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] arg) {
        // create scanner
        Scanner input = new Scanner(System.in);
        // obtain investment amount from input
        System.out.print("investment amount is:");
        double investmentAmount = input.nextDouble();
        // obtain annual interest rate from input
        System.out.print("annual interest rate is:");
        double annualInterestRate = input.nextDouble();
        // calculating monthly interest rate based on given annual interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        // obtain number of years of invest from input
        System.out.print("number of years of invest is:");
        int numberOfYears = input.nextInt();
        // use future investment value formula to do the final calculating
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), numberOfYears * 12);
        // print out the final number of the value
        System.out.println("future investment value is: " + futureInvestmentValue);
    }
}
