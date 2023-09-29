/*
 * File        : palindrome.java
 * Description :Palindrome of a number
             
 * Author      : Alen Siju
 * Version     : 1.0
 * Date        : 29/09/23
 */
import java.util.Scanner;
public class Palindrome {
	private static String input;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		boolean ispalindrome=check(input);
		if(ispalindrome) {
			System.out.println("THE GIVEN STRING IS PALINDROME");
		}
		else{
			System.out.println("THE GIVEN STRING IS NOT PALINDROME");
			}
	}
	/*function receives string as oinput
	 * return true if it is palindrome else false
	 */
	static boolean check(String input) {
		char[]charArray= input.toCharArray();
		int length=input.length();
		for(int i=0;i<length/2;i++) {
			if(charArray[i]!=charArray[length-i-1]) {
				return false;
			}
		}
		return true;
	}

}
