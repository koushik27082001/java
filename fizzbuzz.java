class Fizzbuzz
{
 public static void main(String args[])
	{
	int num=14;
	if(num%3==0)
		{
			if(num%5==0)
				System.out.println("fizzbuzz");
			else
				System.out.println("fizz");
		}
	else
		{
			if(num%5==0)
				System.out.println("buzz");
			else
				System.out.println(num);
		}

	}
}