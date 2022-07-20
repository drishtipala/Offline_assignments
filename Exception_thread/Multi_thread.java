package practicals;

import java.util.Scanner;

public class Multi_thread extends Thread{
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		int num,sum=0,r,num1;
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		num1 = num;
		while(num>0)
		{
			r = num%10;
			sum = sum*10+r;
			num = num/10;
		}
		if(num1==sum)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}
}
