package practicals;

import java.util.Scanner;

public class Multithread extends Thread{
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		int num,r,sum=0,num1;
		System.out.println("Enter a number:");
		num = sc.nextInt();
		num1 = num;
		while(num>0)
		{
			r = num%10;
			sum = sum+r*r*r;
			num = num/10;
		}
		if(num1 == sum)
		{
			System.out.println("It is an Armstrong number");
		}
		else
		{
			System.out.println("It is not an Armstrong number");
		}
	}
}
