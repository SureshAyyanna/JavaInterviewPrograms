package InterviewPrograms;

import java.util.Scanner;

public class ReverseNumber {
	static int revNum = 0;

	// Method 01:Using Algorithm
	public static int reverseOfNumber(int num) {
		while (num != 0) {
			revNum = revNum * 10 + num % 10;
			num = num / 10;
		}
		return revNum;
	}

	// Method 02: using StringBuffer class
	public static StringBuffer reversedNumber(int number) {

		StringBuffer sb = new StringBuffer(String.valueOf(number));
		StringBuffer rev = sb.reverse();
		return rev;
	}

	// Method 03: using StringBuilder class
	public static StringBuilder reversedNum(int value) {

		StringBuilder sb1 = new StringBuilder();
		StringBuilder revValue = sb1.append(value).reverse();
		return revValue;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int actualNumber = input.nextInt();

		System.out.println("Reverse of a number using Method 01: " + reverseOfNumber(actualNumber));
		System.out.println("Reverse of a number using Method 02: " + reversedNumber(actualNumber));
		System.out.println("Reverse of a number using Method 03: " + reversedNum(actualNumber));

	}
}
