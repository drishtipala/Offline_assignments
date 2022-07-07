package result;

import java.util.Scanner;

import grt_no.Greater;

public class Pack_res {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pack_res obj = new Pack_res();
		obj.accept();
	}
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		int size,num1,num2;
		System.out.println("Enter a number:");
		num1 = sc.nextInt();
		operations.Factorial obj = new operations.Factorial();
        obj.fact(num1);
        System.out.println("Enter two numbers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        operations.Arithmetic obj1= new operations.Arithmetic();
        obj1.oper(num1,num2);
		System.out.println("Enter size of array:");
		size = sc.nextInt();
		int[] num = new int[size];
		System.out.println("Enter " +size+ " numbers:");
		int i;
		for(i=0;i<size;i++)
		{
			num[i] = sc.nextInt();
		}
		grt_no.Greater.GRT(num);
		char v;
		System.out.println("Enter a character of your choice:");
		v = sc.next().charAt(0);
		vowels.Vowels obj4 = new vowels.Vowels();
		obj4.vowel(v);
	}

}
