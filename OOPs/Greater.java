package grt_no;

import java.util.Scanner;

public class Greater{
	Scanner sc = new Scanner(System.in);
	public static void GRT(int[] num)
	{
		int temp = num[0];
		for(int i=0;i<num.length;i++)
		{
		     if(temp<num[i])
		    {
			   temp=num[i];
		    }
		}
		System.out.println("Greater number is: "+temp);
	}
}
	




