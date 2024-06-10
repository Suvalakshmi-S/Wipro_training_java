import java.util.Scanner;
class Q5
{
public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the characters:");
		char a=sc.next().charAt(0);
		if(Character.isLetter(a))
		{
			System.out.println("Alphabet");
		}
		else if(Character.isDigit(a))
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character.");
		}

	}
}