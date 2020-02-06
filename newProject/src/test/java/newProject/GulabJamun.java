package newProject;

public class GulabJamun implements Sweets
{
	int n;
	double wt3=0.028;
	GulabJamun(int n)
	{
		this.n=n;
	}
	public double weights(int n)
	{
		return wt3*n;
	}

}
