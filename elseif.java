import java.util.Scanner;
class elseif
	{
		public static void main(String args[])
		{
			Scanner num1=new Scanner(System.in);
			System.out.print("enter the number1:");
			int n=num1.nextInt();	
			Scanner num2=new Scanner(System.in);
			System.out.print("enter the number2:");
			int m=num2.nextInt();
			if(n>m)
				{ System.out.println(" number 1 is greater than number 2 ");
				}
			else if(n<m)
				{ System.out.println("number1 is less than number 2 ");
				}
			else
				{ System.out.println("number 1 is equal to number 2");
				}
		}
	}
