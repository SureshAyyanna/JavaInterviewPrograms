package InterviewPrograms;

import java.util.Scanner;

public class ReverseEachWord {

	// Method 01
	public static String revWordsOfString(String str) {
		// s1.Split the String with whitespace
		String[] words = str.split(" ");

		// s2. Using for each loop read each word and reverse it
		String revstr = "";
		for (String w : words) {
			String revword = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				revword = revword + w.charAt(i);
			}
			revstr = revstr + revword + " ";
		}
		return revstr;
	}

//Method 02
	public static String revWordOfString(String str) {
		// s1.Split the String with Space Reg.Expression(\\s)

		String[] word = str.split(" \\s");

		String revword = "";
		for (String w : word) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();

			revword = revword + sb.toString() + " ";
		}
		return revword;
	}

	public static void main(String[] args) {
		System.out.println("Enter the Actual String:");
		Scanner input = new Scanner(System.in);
		String actualString = input.nextLine();

		String ExpectedString = revWordsOfString(actualString);

		System.out.println("The Reverse word of each string of given String from Method 1: " + ExpectedString);
		System.out.println(
				"The Reverse word of each string of given String from Method 2:" + revWordOfString(actualString));
	}
}
