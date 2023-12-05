import java.util.Scanner;
import java.util.StringTokenizer;
public class STRINGTOKENIZER {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the Integers");
		String LineofIntegers = sc.nextLine();
		StringTokenizer tokenizer= new StringTokenizer(LineofIntegers);
		while(tokenizer.hasMoreTokens()) {
			int num=Integer.parseInt(tokenizer.nextToken());
			System.out.println(num);
			sum+=num;
			
		}
		System.out.println("Sum is"+sum);
		
		
		
	}
	

}
