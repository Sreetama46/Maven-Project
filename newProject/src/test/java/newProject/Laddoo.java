package newProject;

public class Laddoo implements Sweets
{
	int n;
	double wt2=0.030;
	Laddoo(int n)
	{
		this.n=n;
	}
	public double weights(int n)
	{
		return wt2*n;
	}

}
