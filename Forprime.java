public class Forprime 
{
	public static void main(String[] args)
	{
		int num=10;
		int c=0;
		for(int start=1;start<=num/2;start++)
		{
			if(num%start==0)
				c++;
		}
		if(c==1)
			System.out.println("prime");
		else
			System.out.println(" not a prime");
		}
}
