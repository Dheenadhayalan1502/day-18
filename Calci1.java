import java.util.Scanner;
class Calci1
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the operation to be performed");
	System.out.println("1. Addition");
	System.out.println("2. Subraction");
	System.out.println("3.multiplication ");
	System.out.println("4.division");
	System.out.print("enter the choise :");
	int choise=sc.nextInt();
	
	System.out.print("enter the number 1:");
	double n1=sc.nextDouble();
	System.out.print("enter the number 2: ");
	double n2=sc.nextDouble();
	double res;
	switch(choise)
	{
		case 1:
		{
			res=n1+n2;
			System.out.print("sum of two number is :"+res);
			break;
		}
		case 2:
		{
			res=n1-n2;
			System.out.print("difference of two number is :"+res);
			break;
		}
		case 3:
		{
			res=n1*n2;
			System.out.print("product of two number is :"+res);
			break;
		}
		case 4:
		{
			if(n2>0)
			{
				res=n1/n2;
				System.out.print("quotient of two number is :"+res);
			}
			else
			{
				System.out.print("n2 cannot be zero :");
			}
			break;
		}
		default:
		{
			System.out.print("only 4 operation available :");
		}
	}
	}
	
}