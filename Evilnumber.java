class Evilnumber
{
	public static void main(String args[])
	{
		int num=9,sum=0,temp=0;
		sum=num*num;
		while(sum>0)
		{
			int rem=sum%10;
			temp=temp+rem;
			sum/=10;
			
		}
		System.out.println(temp);
		if(temp==num)
			{
			System.out.println("Evil Number");
			}
		else
			{	
			System.out.println("not evil number");
			}
		
	}
}
