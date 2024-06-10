import java.util.Scanner;
class Q12
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int flag=0;
		if (num==2)
		{
		System.out.println("Prime Number");
		}
		else
		{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				{
				flag=1;	
			}
		}
		}
		if(flag==1)
		{
			System.out.println("Not a prime number.");
		}
		else
		{
			System.out.println("Prime Number");
		}
	}
		
}