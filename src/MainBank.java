import java.util.Scanner;
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNO, String name, double initialBalance) {
        accountNumber = accNO;
        accountHolderName = name;
        balance = initialBalance;
        System.out.println("Account opened successfully for" + accountHolderName);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Dposited:"+amount);
    }

    void withdraw(double amount) {
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn:"+amount);
        }
        else {
            System.out.println("Insufficient Balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance:"+balance);
    }
}
class SavingAcoount extends BankAccount{
    double interestRate = 4.0;//4%
    void calculateInterest(){
        double interest = (balance * interestRate)/100;
        System.out.println("Interest Earned(Saving Account):"+interest);
    }
}
class FixedDepositAccount extends BankAccount{
    double rate = 6.5;//6.5%
    int time;//in years
    void maturityAmount(){
        double maturity = balance * Math.pow((1+rate/100),time);
        System.out.println("Maturity Amount (FD):"+maturity);
    }
}
public class MainBank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SavingAcoount sa = new SavingAcoount();
        sa.openAccount(101,"Himesh",1000000);
        sa.deposit(50000);
        sa.withdraw(30000);
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println("\n---------------------------------\n");
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(102,"Neal",5000000);
        fd.time = 3;//3 years.
        fd.checkBalance();
        fd.maturityAmount();
    }
}
