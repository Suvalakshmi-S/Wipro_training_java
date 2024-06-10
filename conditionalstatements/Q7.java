import java.util.Scanner;
class Q7
{
	public static void main(String[] args) 
	{
		Scanner as = new Scanner(System.in);
		System.out.println("Enter any letter:");
		char a = as.next().charAt(0);
		if(Character.isLowerCase(a)) {


			System.out.println(Character.toUpperCase(a));
	}
	else if(Character.isUpperCase(a)) {
			System.out.println(Character.toLowerCase(a));
	}
	else {
          System.out.println("invalid input");
	}
	}
}