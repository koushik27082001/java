class Library
{
 public static void main(String args[]){
	System.out.println("library");
	
	String book_name="java";
	String book_department="cse";
	int price=3000;
	int days=22;
	String issue="10-11-23";
	System.out.println("Book_name:"+book_name);
	System.out.println("Book_department:"+book_department);
	System.out.println("book_price:"+price);
	System.out.println("book_date_of_issue:"+issue);
		if(days<=3)
		{
			System.out.println("you have no fine");
		}
		else if(days<=10)
		{
			System.out.println("you have to pay fine:"+days*10);
		}
		else if(days<=30)
		{
			System.out.println("you have to pay fine:"+days*100);
		}
		else 
		{
			System.out.println("you have to pay book_price:"+price);

		}
	}
}