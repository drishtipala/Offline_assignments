package oop;

import java.util.Scanner;

public class Encaps_1_result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String stu_name;
		int[] marks = new int[5];
		int i=0;
		char grade=0;
		System.out.println("Enter student name:");
		stu_name = sc.next();
		System.out.println("Enter marks of five subjects:");
		for(i=0;i<5;i++)
		{
			marks[i] = sc.nextInt();
		}
		int roll_no;
		System.out.println("Enter student roll_no:");
		roll_no = sc.nextInt();
		Encaps_1 obj = new Encaps_1();
		System.out.println("Name: "+stu_name);
		obj.set_roll_no(roll_no);
		System.out.println("Roll No: "+obj.get_roll_no());
		float per;
		obj.set_percentage();
		System.out.println("Percentage:"+obj.get_percentage());
		obj.set_grade();
	}
}
