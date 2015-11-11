/**
 * Sum of Primes
 * --------------
 * CHALLENGE DESCRIPTION:
 * Write a program which determines the sum of the first 1000 prime numbers.
 * 
 * INPUT SAMPLE:
 * There is no input for this program.
 * 
 * OUTPUT SAMPLE:
 * Print to stdout the sum of the first 1000 prime numbers.
 * 3682913
 */
package com.codeeval.easy;

public class SumofPrimes {

	public static void main(String[] args) {
		int sum = 0;
		int num = 2;
		int count = 0;
		while ( count < 1000) {
			if (isPrime(num)) {
				sum += num;
				count++;
			}
			num++;
		}
		System.out.println(sum);
	}

	private static boolean isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= num/2 ; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
