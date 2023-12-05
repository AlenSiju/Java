import java.util.Scanner;
public class trycatch {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		char choice='y';
		while(choice=='y') {
		try {
			System.out.println("Enter Number1:");
			int number1=sc.nextInt();
			System.out.println("Enter Number2:");
			int number2=sc.nextInt();
		    int result=number1/number2;
		    System.out.println("Result="+result);
		}
		catch(ArithmeticException e) {
			System.out.println("division by zero");
		}
		finally {
			System.out.println("End of operation");
		}
		System.out.println("DO YOU WANT TO CONTINUE(Y/N)?");
		choice=sc.next().charAt(0);
		}
		
	}

}
