import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
public class OptionMenu extends Account {
	Scanner scr = new Scanner(System.in);
	DecimalFormat money = new DecimalFormat("'$'###,###.00");
    Map<Integer, Integer> data = new HashMap<Integer,Integer>();
    
    public void getLogin() throws IOException {
    	int x = 1;
    	int customernumber = 0;
    	int pin = 0;
    	do {
    		try {
    			data.put(342234, 789);
    			data.put(675878, 1234);
    			System.out.println("Welcome to ATM Project!");
    			System.out.println("Enter customer number: ");
    			customernumber = scr.nextInt();
    			System.out.println("Enter Pin number");
    			pin =scr.nextInt();
        		}    
    		catch(Exception e) {
    			System.out.println("Invalid character.Enter only numbers.");
    			x = 2;
    		}
    		for(Map.Entry<Integer, Integer> entry : data.entrySet()) {
    			if(entry.getKey() == customernumber && entry.getValue() == pin) {
    				getAccountType();
    			}
    		}
    	    System.out.println("\n" + "wrong customer or pin number." + "\n");
     }
    while(x == 1);
    	
  }
public void getAccountType() {
	System.out.println("Select the Account: ");
	System.out.println("Type1 - Checking Account");
	System.out.println("Type2 - Saving Account");
	System.out.println(" Type3 - Exit");
	System.out.println("choice :");
	int selection = scr.nextInt();
	switch(selection) {
	case 1:
		getChecking();
		break;
	case 2:
		getSaving();
		break;
	case 3:
		System.out.println("Thank you for using this ATM");
		break;
	default:
	    System.out.println("\n" + "Invalid Choice" + "\n");
	    getAccountType();
		break;
	   }
	}
public void getChecking() {
	System.out.println("Checking Account: ");
	System.out.println("Type1 - View Balance");
	System.out.println("Type2 - Withdraw Fund");
	System.out.println("Type3 - Deposit Funds");
	System.out.println("Type4 - Exit");
	System.out.println("choice :");
	
	int selection = scr.nextInt();
	switch(selection) {
	case 1:
		System.out.println("Your Current Balance is "+ money.format(getCheckingBalance()));
		getAccountType();
		break;
	case 2:
		checkingWithdrawInput();
		getAccountType();
		break;
	case 3:
		checkingDepositInput();
		getAccountType();
		break;
	case 4:
		System.out.println("Thank you for using ATM");
	    break;
	default:
		System.out.println("\n" + "Invalid choice" + "\n");
		getChecking();
	}
	
}
public void getSaving() {
	System.out.println("Saving Account: ");
	System.out.println("Type1 - View Balance");
	System.out.println("Type2 - Withdraw Fund");
	System.out.println("Type3 - Deposit Funds");
	System.out.println("Type4 - Exit");
	System.out.println("choice :");
	
	int selection = scr.nextInt();
	switch(selection) {
	case 1:
		System.out.println("Your Current Balance is "+ money.format(getSavingBalance()));
		getAccountType();
		break;
	case 2:
		SavingWithdrawInput();
		getAccountType();
		break;
	case 3:
		SavingDepositInput();
		getAccountType();
		break;
	case 4:
		System.out.println("Thank you for using ATM");
	    break;
	default:
		System.out.println("\n" + "Invalid choice" + "\n");
		getChecking();
	}
	
}
}


