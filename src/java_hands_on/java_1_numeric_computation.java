//Problem : Find Interest Value

package java_hands_on;
import java.util.Scanner;

class Account{
    private int id;
    private double balance;
    private double interestRate;

    // Constructor with parameters
    public Account(int id, double balance, double interestRate){
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Getters
    public int getId(){ return id; }
    public double getBalance(){ return balance; }
    public double getInterestRate(){ return interestRate; }

    // Setters
    public void setId(int id){ this.id = id; }
    public void setBalance(double balance){ this.balance = balance; }
    public void setInterestRate(double interestRate){ this.interestRate = interestRate; }
}

public class java_1_numeric_computation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        double balance = sc.nextDouble();
        double interestRate = sc.nextDouble();

        Account account = new Account(id, balance, interestRate);

        int noOfYears = sc.nextInt();

        double interest = calculateInterest(account, noOfYears);
        System.out.printf("%.3f",interest);

        sc.close();
    }

    private static double calculateInterest(Account account, int noOfYears) {
        double finalInterestRate = account.getInterestRate() + (account.getInterestRate() * noOfYears / 100);
        return account.getBalance() * (finalInterestRate / 100);
    }
}
