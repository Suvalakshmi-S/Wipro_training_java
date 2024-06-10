import java.util.Scanner;
class Q1A
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=sc.nextInt();
		if (a<0)
		{
			System.out.println("Negative");
		}
			else if (a == 0)
			{
				System.out.println("Zero");
			}
			else 
			{
				System.out.println("Positive");
			}
		
	}
}