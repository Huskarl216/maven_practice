package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String args[]){
		float a,b,res;
		char choice ,ch;
		
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.println("1.Add two numbers\n");
			System.out.println("2. Exit\n");
			System.out.println("3.Subtract two numbers\n");
			System.out.println("4.Multiply two numbers\n");
			System.out.println("Enter your choice: ");
			choice=scan.next().charAt(0);
			switch(choice){
				case '1':	System.out.print("Enter two numbers: ");
							a=scan.nextFloat();
							b=scan.nextFloat();
							res=a+b;
							System.out.println("Result = "+ res);
							break;
				case '2':	System.exit(0);
							break;
				case '3':	System.out.print("Enter two numbers: ");
							a=scan.nextFloat();
							b=scan.nextFloat();
							res=a-b;
							System.out.println("Result = "+ res);
							break;
				case '4':	System.out.print("Enter two numbers: ");
							a=scan.nextFloat();
							b=scan.nextFloat();
							res=a*b;
							System.out.println("Result = "+ res);
							break;
				default:	System.out.println("INVALID CHOICE!!!!!!!!!!!!!!!!!!!!!!!!!!!");
							break;
				
			}
			System.out.print("\n-------------------------------------------------\n");
		}while(choice!=2);
	}
}
