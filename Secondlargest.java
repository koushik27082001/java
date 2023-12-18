public class Secondlargest
{
	public static void main(String[] args)
	{
	int a[]= {10,20,30,40,50,60,70,80};
	for(int x=0;x<=a.length-1;x++) 
	{
		for(int y=x+1;y<=a.length-1;y++) 
		{
			if(a[x]>a[y]) 
			{
			int temp=a[x];
			a[x]=a[y];
			a[y]=temp;
			}
		}
	}
	for(int x=a.length-1;x>1;x++) 
	{
		if(a[x]>a[x-1]) 
		{
			System.out.println(a[x-1]);
			break;
		}
	}
	}

