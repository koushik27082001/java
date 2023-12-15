class Student
{
 public static void main(String args[]){
	System.out.println("student application");
	
	String S_name="ramu";
	int s_age=20;
	char s_section='A';
	String s_gender="male";
	int m1=2,m2=1,m3=7,m4=5,m5=6;
	int total=m1+m2+m3+m4+m5; 
	System.out.println("student name:"+S_name);
	System.out.println("student age:"+s_age);
	System.out.println("student section:"+s_section);
	System.out.println("student gender:"+s_gender);
	System.out.println("student total marks:"+total);
		if(total>=80)
		{
			System.out.println("student grade:A");
		}
		else if(total>=60)
		{
			System.out.println("student grade:B");
		}
		else if(total>=40)
		{
			System.out.println("student grade:C");
		}
		else 
		{
			System.out.println("F");

		}
	}
}