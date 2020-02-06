package newProject;

public class Dark_Choco extends Choco
{
	
	private double wt=0.060;
	Dark_Choco(int n)
	{
		super(n);
	}
	public double weight(int n)
	{
		return n*wt;
	}

}
