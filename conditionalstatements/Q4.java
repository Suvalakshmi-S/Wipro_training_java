import java.util.Scanner;
class Q4
{
public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the characters:");
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		if(a<b)
		{
			System.out.println(a+" , "+b);
		}
		else
		{
			System.out.println(b+ " , "+a);
		}

	}
}