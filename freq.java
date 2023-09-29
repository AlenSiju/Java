/*
 * File        : freq.java
 * Description :frequency of a character in a string            
 * Author      : Alen Siju
 * Version     : 1.0
 * Date        : 29/9/23
 */
import java.util.Scanner;
public class freq {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		System.out.println("enter the character");
		char checkMe=sc.next().charAt(0);
		int CharCount=CheckFreq(input,checkMe);
		System.out.println("frequency of given character is:"+CharCount);
    }
	static int CheckFreq(String input,char checkMe) {
		char[]charArray=input.toCharArray();
		int charCount=0;
		for(int i=0;i<input.length();i++) {
			if(charArray[i]==checkMe) {
				charCount++;
			
			}
		}
		return charCount;
	}
		
	}
	
