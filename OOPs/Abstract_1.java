//WAP to take student data and perform palindrome by using abstraction

package practicals;

import java.util.Scanner;

public abstract class Abstract_1 {
	Scanner sc = new Scanner(System.in);
	public abstract void demo();
	public void stu_data()
	{
		String name;
		int roll_no,i,sum=0;
		char grade;
		float per;
		int marks[] = new int[5];
		System.out.println("Enter student name:");
		name = sc.next();
		System.out.println("Enter student roll no:");
		roll_no = sc.nextInt();
		System.out.println("Enter five subject marks:");
		for(i=0;i<5;i++)
		{
			marks[i] = sc.nextInt();
			sum = sum+marks[i];
		}
		per = sum*100/500;
		System.out.println("Percentage: " +per);
		if(per>90 && per<100)
		{
			System.out.println("Grade A");
		}
		else if(per>80 && per<90)
		{
			System.out.println("Grade B");
		}
		else if(per>70 && per<80)
		{
			System.out.println("Grade C");
		}
		else if(per>60 && per<70)
		{
			System.out.println("Grade D");
		}
		else if(per>50 && per<60)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("Grade F: Sorry you have failed......");
		}
	}
}
