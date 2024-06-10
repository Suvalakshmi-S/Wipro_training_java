import java.util.Scanner;
class Q1B
{
	public static void main( String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 numbers:");
	int a =sc.nextInt();
	int b= sc.nextInt();
	if (a%10==b%10)
	{
	System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
}
}