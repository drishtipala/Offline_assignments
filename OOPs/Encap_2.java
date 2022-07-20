package practicals;

import java.util.Scanner;

public class Encap_2 {
	public static void Encap_2()
	{
		Scanner sc = new Scanner(System.in);
		String name;
		Encap_1 obj = new Encap_1();
		System.out.println("Enter Student name:");
		name = sc.next();
		int roll_no;
		System.out.println("Enter Student Roll No.:");
		roll_no = sc.nextInt();
		int physicsmarks,chemistrymarks,biologymarks;
		System.out.println("Enter marks for Physics:");
		physicsmarks = sc.nextInt();
		System.out.println("Enter marks for Chemistry:");
		chemistrymarks = sc.nextInt();
		System.out.println("Enter marks for Biology:");
		biologymarks = sc.nextInt();
		System.out.println("Name: "+name);
		obj.set_roll_no(roll_no);
		System.out.println("Roll No.: "+obj.get_roll_no());
		obj.set_physics_marks(physicsmarks);
		System.out.println("Physics Marks: "+obj.get_physics_marks());
		obj.set_chemistry_marks(chemistrymarks);
		System.out.println("Chemistry Marks: "+obj.get_chemistry_marks());
		obj.set_biology_marks(biologymarks);
		System.out.println("Biology Marks: "+obj.get_biology_marks());
		obj.set_percentage();
		System.out.println("Percentage of PCB is: "+obj.get_percentage());
	}
}
