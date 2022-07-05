package practicals;

import java.util.Scanner;

public class Inf_2 implements Inf_1{
    Scanner sc = new Scanner(System.in);
    int num,bal=1000,dep_amo,with_amo;
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Enter deposit amount:");
		dep_amo = sc.nextInt();
		bal = bal+dep_amo;
		System.out.println("Total balance available: "+bal);
	}
	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("Enter amount to be withdrawn:");
		with_amo = sc.nextInt();
		if(bal<with_amo)
		{
			System.out.println("Not sufficient balance");
		}
		else
		{
			bal = bal-with_amo;
			System.out.println("Total balance available: "+bal);
		}
	}
	static Inf_2 obj;
	public static void main(String[] args)
	{
	    obj = new Inf_2();
		//obj.deposit();
		//obj.withdrawal();
		obj.accept();
	}
    public void accept()
    {
    	int choice;
    	System.out.println("1:Deposit, 2:Withdrawal");
    	System.out.println("Enter your choice:");
    	choice = sc.nextInt();
    	switch(choice)
    	{
    	case 1:
    		obj.deposit();
    		break;
    	case 2:
    		obj.withdrawal();
    		break;
    	default:
    		System.out.println("Invalid choice");
    	}
    }
}
