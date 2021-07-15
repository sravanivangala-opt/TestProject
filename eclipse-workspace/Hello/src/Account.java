import java.text.*;
import java.util.*;
public class Account {
	 private double checkingBalance = 0;
     private double SavingBalance = 0;
	Scanner scr =new Scanner(System.in);
	DecimalFormat money = new DecimalFormat("'$'###,##0.00");
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public double getSavingBalance() {
		return SavingBalance;
	}
	public double calCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	public double calSavingWithdraw(double amount) {
		SavingBalance = (SavingBalance - amount);
		return SavingBalance;
	}
	public double calCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	public double calSavingDeposit(double amount) {
		checkingBalance = (SavingBalance + amount);
		return checkingBalance;
		}
	public void checkingWithdrawInput() {
		System.out.println("Checking Account Balance: " + money.format(checkingBalance));
		System.out.println("Amount you want to withdraw from our account: ");
		double amount = scr.nextDouble();
		if((checkingBalance - amount) >= 0) {
			calCheckingWithdraw(amount);
			System.out.print("New Checking Balance: " + money.format(checkingBalance));
		}else {
			System.out.println("Balance cannot be negative" + "\n");
		}
		
	}
	public void checkingDepositInput() {
		System.out.println("Checking Account Balance: " + money.format(checkingBalance));
		System.out.println("Amount you want to Deposit to your account: ");
		double amount = scr.nextDouble();
		if((checkingBalance + amount) >= 0) {
			calCheckingDeposit(amount);
			System.out.print("New Checking Balance: " + money.format(checkingBalance));
		}
		else {
			System.out.println("Balance cannot be negative" + "\n");
		}
	}
	
	public void SavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + money.format(SavingBalance));
		System.out.println("Amount you want to withdraw from our account: ");
		double amount = scr.nextDouble();
		if((SavingBalance - amount) >= 0) {
			calSavingWithdraw(amount);
			System.out.print("New Saving Balance: " + money.format(SavingBalance));
		}else {
			System.out.println("Balance cannot be negative" + "\n");
		}
		
	}
	public void SavingDepositInput() {
		System.out.println("Checking Account Balance: " + money.format(SavingBalance));
		System.out.println("Amount you want to deposit to our account: ");
		double amount = scr.nextDouble();
		if((SavingBalance + amount) >= 0) {
			calSavingDeposit(amount);
			System.out.print("New Checking Balance: " + money.format(SavingBalance));
		}
		else {
			System.out.println("Balance cannot be negative" + "\n");
		}
	}
	
	

}
