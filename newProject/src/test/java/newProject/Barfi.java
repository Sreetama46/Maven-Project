package newProject;

public class Barfi implements Sweets
{
	int n;
	double wt1=0.025;
	Barfi(int n)
	{
		this.n=n;
	}
	public double weights(int n)
	{
		return wt1*n;
	}

}
