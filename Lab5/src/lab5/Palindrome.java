package lab5;

import java.util.*;

/**
 * 
 * @author Michaela Bueche
 *
 */
public class Palindrome {


	private Scanner input;
	private int end;
	/**
	 * Constructor
	 */
	public Palindrome() {
		input = new Scanner(System.in);
		printOut();
	}
	/**
	 * prints statement saying whether or not input is a palindrome
	 */
	public void printOut() {
		if(isaPalindrome(input.next())==true)
			System.out.println("That is a palindrome.");
		else
			System.out.println("That is not a palindrome.");
	}
	/**
	 * 
	 * @param expr
	 * @return boolean whether or not input is a palindrome
	 */
	public boolean isaPalindrome(String expr) {
		expr=expr.replace(" ", "");
		//if expr length is 0 not  palindrome
		if(expr.length()==1) {
			return true;
		}
		//if expr length is 1 is palindrome
		if(expr.length()==2&&expr.substring(0,1).equalsIgnoreCase(expr.substring(1))) {
			return true;
		}
		//if expr length is 2 and chars are equal is palindrome 
		if(expr.length()==2&&!(expr.substring(0).equalsIgnoreCase(expr.substring(1)))) {
			return false;
		}
		//if expr length is 2 and chars not equal not palindrome
		end=expr.length();//lenght of expr
		if(expr.substring(0,1).equalsIgnoreCase(expr.substring(end-1))) {
			isaPalindrome(expr.substring(1, end-1));
			return true;
		}//if first and last char equal recurse through method removing first and last char
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Input:");
		new Palindrome();
	}
}
