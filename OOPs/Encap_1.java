package practicals;

public class Encap_1 {
	private int roll_no;
	private int physicsmarks,chemistrymarks,biologymarks;
	private float percentage;
    int sum=0;
	
	public void set_roll_no(int newroll)
	{
		roll_no = newroll;
	}
	public int get_roll_no()
	{
		return roll_no;
	}
	public void set_physics_marks(int physics)
	{
		physicsmarks = physics;
	}
	public int get_physics_marks()
	{
		return physicsmarks;
	}
	public void set_chemistry_marks(int chemistry)
	{
		chemistrymarks = chemistry;
	}
	public int get_chemistry_marks()
	{
		return chemistrymarks;
	}
	public void set_biology_marks(int biology)
	{
		biologymarks = biology;
	}
	public int get_biology_marks()
	{
		return biologymarks;
	}
	public void set_percentage()
	{
		sum = physicsmarks + chemistrymarks + biologymarks;
		percentage = sum*100/300;
	}
	public float get_percentage()
	{
		return percentage;
	}

}
