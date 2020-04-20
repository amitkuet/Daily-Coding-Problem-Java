package daily.coding.n70;

/**
A number is considered perfect if its digits sum up to exactly 10.
Given a positive integer n, return the n-th perfect number.

For example, given 1, you should return 19. Given 2, you should return 28.
*/

public class Solution {

	private static int getNthPerfectNumber(int n) {
		int number = 1, result = 0;
		
		while (n > 0) {
			if (getSumOfDigits(number) == 10) {
				result = number;
				n--;
			}
			number++;
		}
		return result;
	}

	private static int getSumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 1;
		System.out.println(getNthPerfectNumber(n)); // should print 19

		n = 2;
		System.out.println(getNthPerfectNumber(n)); // should print 28
	}

}
