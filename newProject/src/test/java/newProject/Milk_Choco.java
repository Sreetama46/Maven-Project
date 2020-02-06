package newProject;

public class Milk_Choco extends Choco
{

	private double wt=0.050;
	Milk_Choco(int n)
	{
		super(n);
	}
	public double weight(int n)
	{
		return n*wt;
	}

}
