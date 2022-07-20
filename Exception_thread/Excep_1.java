package practicals;

import java.util.Scanner;

public class Excep_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		if(num%10==0)
		{
			throw new Exception1("Number is divisible");
		}
		else
		{
			System.out.println("Number is not divisible");
		}
	}
}
