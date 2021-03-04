package hackerrrank.challenges;

import java.io.*;
import java.util.*;

/*{@link https://www.hackerrank.com/contests/launchpad-1-winter-challenge/challenges/string-reverse-4/problem}
*/
public class StringReverse {
	public static void reverse(char[] a, int start, int end) {
		// reverse a string in place
		while (start < end) {
			char temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		int n;
		String s;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		scan.nextLine();
		for (int k = 0; k < n; k++) {
			s = scan.nextLine();

			char[] sChars = s.toCharArray();
			// first reverse the entire string input or the sentence
			// "Hello World" becomes "World Hello"
			reverse(sChars, 0, sChars.length - 1);

			char[] copySChars = new char[sChars.length];
			for (int i = 0; i < sChars.length; i++) {
				copySChars[i] = sChars[i];
				if (sChars[i] == 32) {
					int end = i;
					int start = i + 1;
					// now reverse each word in the reversed string
					// "World Hello" becomes "dlroW olleH"
					reverse(copySChars, start, end);
				}
			}
			System.out.println(copySChars);
		}
	}
}