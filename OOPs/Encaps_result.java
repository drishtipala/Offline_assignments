package OOPs;

import java.util.Scanner;

public class Encaps_result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long phone_no;
		String name;
		System.out.println("Enter your name: ");
		name = sc.next();
		System.out.println("Enter your phone number:");
		phone_no = sc.nextLong();
		int deposit;
		System.out.println("Enter amount to be deposited:");
		deposit = sc.nextInt();
		Encapsulation obj = new Encapsulation();
		int account_no;
		System.out.println("Enter your account number:");
		account_no = sc.nextInt();
		obj.set_bal(deposit);
        System.out.println("Final amount is: "+obj.get_bal());
        int withdrawal;
        System.out.println("Enter withdrawal amount:");
        withdrawal = sc.nextInt();
        obj.set_withdraw(withdrawal);
        if(withdrawal<obj.get_bal())
        {
            System.out.println("Final amount is: "+obj.get_withdraw());
        }
        else
        {
        	System.out.println("Amount is not sufficient to withdraw");
        }
	}
}
