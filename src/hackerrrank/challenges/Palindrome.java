package hackerrrank.challenges;

import java.io.*;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		char[] aChars = A.toCharArray();

		if (isPalindrome(aChars)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static boolean isPalindrome(char[] aChars) {
		int start = 0;
		int end = aChars.length - 1;

		while (start < end) {
			if (aChars[start] != aChars[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}