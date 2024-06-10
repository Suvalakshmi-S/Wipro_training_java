import java.util.Scanner;
class Q2
{
	public static void main( String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int a =sc.nextInt();
	if(a<=0)
		{
			System.out.println("Zero or negative number");
		}
	else if (a%2==0)
	{
	System.out.println("Even");
	}
	else
	{
		System.out.println("Odd");
	}
}
}