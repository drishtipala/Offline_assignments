package practicals;

import java.util.Scanner;

public class Multi_thread1 extends Thread{
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		int i,j;
		int[]  num = new int[5];
		int temp=0;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter numbers: ");
		for(i=0;i<5;i++)
		{
			num[i] = sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
		   for(j=0;j<5;j++)
		   {
			   if(num[i]<num[j])
			   {
			     temp = num[i];
			     num[i] = num[j];
			     num[j] = temp;
			   }
		   }
		}
		System.out.println("Ascending Order: ");
		for(i=0;i<5;i++)
		{
			System.out.println(num[i] + "");
		}
	}
}
