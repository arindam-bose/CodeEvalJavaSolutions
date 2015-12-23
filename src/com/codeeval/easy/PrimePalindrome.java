/**
 * Prime Palindrome
 * ------------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * Write a program which determines the largest prime palindrome less than 1000.
 *
 * INPUT SAMPLE:
 * There is no input for this program.
 *
 * OUTPUT SAMPLE:
 * Print to stdout the largest prime palindrome less than 1000.
 * 929
 */
package com.codeeval.easy;

public class PrimePalindrome {

	public static void main(String[] args) {
		int num = 1000;
		boolean yes = true;
		while (yes) {
			if (isPalindrome(num)) {
				if (isPrime(num)) {
					System.out.println(num);
					yes = false;
				}
			}
			num--;
		}
	}

	private static boolean isPrime(int num) {
		boolean prime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}

	private static boolean isPalindrome(int num) {
		String strNum = Integer.toString(num);
		boolean palin = true;
		for (int i = 0; i < strNum.length() / 2; i++) {
			if (strNum.charAt(i) != strNum.charAt(strNum.length() - 1 - i)) {
				palin = false;
				break;
			}
		}
		return palin;
	}
}