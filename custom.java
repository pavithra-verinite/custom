package custom_exception;
import java.util.Scanner;

public class custom {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur child age");
		int age=sc.nextInt();
		try
		{
			validate(age);
		}
		catch(AgeNotMatch e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	static String validate(int age) throws AgeNotMatch
	{
		if(age!=6)
		{
			throw new AgeNotMatch("age is not sufficient to join in first class");
		}
		else
		{
		
		System.out.println("age is sufficient to join in first class");
		return "age is sufficient to join in first class";
	}
	}
}
