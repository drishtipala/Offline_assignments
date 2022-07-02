package practicals;

public class Encaps_1 {
	private int roll_no;
	private float percentage;
	private char grade;
	int[] marks = new int[5];
	int i,sum=0;
	public void set_roll_no(int newroll)
	{
		roll_no = newroll;
	}
	public int get_roll_no()
	{
		return roll_no;
	}
	public void set_percentage()
	{
		for(i=0;i<5;i++)
		{
			sum =  sum+marks[i];
		}
		percentage = (sum*100)/500;
		System.out.println("percentage");
	}
	public float get_percentage()
	{
		return percentage;
	}
	public void set_grade(char stu_grade)
	{
		grade = stu_grade;
	}
	public void set_grade()
	{
		if(percentage>91 && percentage<100)
		{
			System.out.println("Passed with grade A");
		}
		else if(percentage>81 && percentage<90)
		{
			System.out.println("Passed with grade B");
		}
		else if(percentage>71 && percentage<80)
		{
			System.out.println("Passed with grade C");
		}
		else if(percentage>60 && percentage<70)
		{
			System.out.println("Passed with grade D");
		}
		else if(percentage>40 && percentage<59)
		{
			System.out.println("Passed with grade E");
		}
		else
		{
			System.out.println("Grade F:Sorry you have failed.....");
		}
	}
}

