package com.arpith.loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {

		this.number = number;
		// TODO Auto-generated constructor stub
	}

	public boolean isPrime() {
		// A number is prime , when a number is not divisible from 2 to number-1
		// ex - if no. is 10 , we need to check if the no. 10 is divisible by nos. from
		// 2-9
		// How can i check if the no. is divisible by 2? %2
		// ex - 9%2 will return 1 means not divisible by 2, but when we divide 9%3
		// reminder will return 0
		/*
		 * so, its not a prime no. for loop can be used.. initialize with 2, check for %
		 * , if "1" is returned , keep updating the value to i till number-1 condition
		 * holds good and check for the same. come out of the loopp if we return 0 as
		 * the no. is not prime anyway
		 */
		if (number < 2) {
			return false; // to handle negative scenario
		}
		for (int i = 2; i <= number - 1; i++) {
			if (number % 2 == 0) {
		return false;
			}

	}
		return true;

}

public int sumUptoN() {
	int sum = 0;
	for (int i = 1; i <= number; i++) {
		sum = sum + i;

	}
	return sum;
}
}
