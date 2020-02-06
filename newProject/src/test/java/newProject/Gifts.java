package newProject;
import java.util.Scanner;

public class Gifts {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int barfi,laddoo,gulab_jamun,m_choco,d_choco;
		System.out.print("Enter the number of gifts: ");
		int gfts = sc.nextInt();
		double[] array = new double[gfts];
		double[] ar = new double[gfts];
		double[] ar2 = new double[gfts];
		double sum=0,nsum=0,s=0,temp=0;
		int i,j;
		for(i=0;i<gfts;i++)
		{
			System.out.print("\nEnter number of barfi for gift " + (i+1) +": ");
			barfi=sc.nextInt();
			System.out.print("Enter number of laddoo for gift " + (i+1) +": ");
			laddoo=sc.nextInt();
			System.out.print("Enter number of gulab jamun for gift " + (i+1) +": ");
			gulab_jamun=sc.nextInt();
			System.out.print("Enter number of milk chocolates for gift " + (i+1) +": ");
			m_choco=sc.nextInt();
			System.out.print("Enter number of dark chocolates for gift " + (i+1) +": ");
			d_choco=sc.nextInt();

			Sweets obj1 = new Barfi(barfi);
			Sweets obj2 = new Laddoo(laddoo);
			Sweets obj3 = new GulabJamun(gulab_jamun);
			Choco obj4 = new Milk_Choco(m_choco);
			Choco obj5 = new Dark_Choco(d_choco);

			sum = obj1.weights(barfi) + obj2.weights(laddoo) + obj3.weights(gulab_jamun) + obj4.weight(m_choco) + obj5.weight(d_choco);
			nsum=sum;
			System.out.println("The weight of gift "+(i+1)+" is "+sum);
			array[i]=sum;
			ar2[i]=nsum;
			ar[i]=barfi+laddoo+gulab_jamun+m_choco+d_choco;
			s=s+array[i];
		}
		System.out.println("\nTotal weight of the gifts are : "+s); 


		for(i=0;i<gfts;i++)
		{
			for(j=0;j<gfts-i-1;j++)
			{
				if(array[j+1]<array[j])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println("Number of candies arranged w.r.t weights of the boxes");

		double mid=array[(int)(gfts/2)];
		System.out.println("");

		for(i=0;i<gfts;i++)
		{
			if(ar2[i]>mid)
				System.out.println("Total no of items in gift"+(i+1)+"= "+(ar[i]+10)+" with 10 candies");
			else
				System.out.println("Total no of items in gift"+(i+1)+"= "+(ar[i]+5)+" with 5 candies");
		}

	}

}


