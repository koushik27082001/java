class Profitloss
{
 public static void main(String args[])
	{
	int cp=1000,sp=1000;
	int profit=sp-cp;
	int loss=cp-sp;
		if(sp>=cp)
			{
				System.out.println("profit"+profit);	
			}
		else
			{
	
				System.out.println("loss"+loss);
			}
	}
}