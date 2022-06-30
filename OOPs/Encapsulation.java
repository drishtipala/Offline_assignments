package OOPs;

import java.util.Scanner;

public class Encapsulation {
	private int acc_no, deposit_amo, balance = 1000,withrawal;
	public void set_bal(int newval)
	{
			balance = balance+newval;
	}
	public int get_bal()
	{
		return balance;
	}
	public void set_acc_no(int newacc)
	{
		acc_no = newacc;
	}
	public int get_acc_no()
	{
		return acc_no;
	}
	public void set_deposit_amo(int newamo)
	{
		deposit_amo = newamo;
	}
	public int get_deposit_amo()
	{
		return deposit_amo;
	}
	public void set_withdraw(int newnum)
	{
		balance = balance-newnum;
	}
	public int get_withdraw()
	{
		return balance;
	}
}
