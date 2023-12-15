class Logical_and
{
 public static  void main(String args[]){

	char letter='?';
		if(letter>='A'&&letter<='Z')
		{
			System.out.println("capitals");
		}
		else if(letter>='a'&&letter<='z')
		{
			System.out.println("small");
		}
		else if((letter>='0'&&letter<='9'))
		{
			System.out.println("number");
		}
		else if(letter=='@'||letter=='#'||letter=='$'||letter=='&')
		{
			System.out.println("symboL");
		}
		else 
		{
			System.out.println("sarigga ivvu raa");

		}
	}
}