import java.util.Scanner;
class Q8
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any letter:");
		char a = sc.next().charAt(0);
		switch(a)
		{
			case 'R':
				System.out.println("Red");
				break;
			case 'B':	
				System.out.println("Blue");
				break;
			case 'G':
					System.out.println("Green");
					break;
			case 'Y':
				System.out.println("Yellow");
					break;
			case 'O':
				System.out.println("Orange");
			break;
			case 'W':
					System.out.println("White");
			break;
			default: 
					System.out.println("Invalid Code");
	}
	}
}