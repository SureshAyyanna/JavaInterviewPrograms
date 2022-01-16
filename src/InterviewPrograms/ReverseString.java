
package InterviewPrograms;

import java.util.Scanner;

public class ReverseString {

	private static String reveresedString = "";

//Method 01 - Using String methods
	public static String revString(String str) {
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			reveresedString += str.charAt(i);
		}
		return reveresedString;
	}

//Method 02 - Using StringArray
	public static String revofString(String str) {
		char a[] = str.toCharArray();
		int len = a.length;
		String revStr = "";
		for (int i = len - 1; i >= 0; i--) {
			revStr += a[i];
		}
		return revStr;
	}

//Method 3 : Using String buffer class
	public static StringBuffer revofAString(String str) {
	StringBuffer sb=new StringBuffer(str);
	StringBuffer revOfString= sb.reverse();
	return revOfString;
	}

	public static void main(String[] args) {
		System.out.println("The Actual string is: ");

		Scanner input = new Scanner(System.in);
		String actualString = input.nextLine();

		reveresedString = revString(actualString);
		System.out.println("The Reversed string from Method 1 is: " + reveresedString);
		System.out.println("Reversed string from Method 2: " + revofString(actualString));
		System.out.println("Reversed string from Method 3: " + revofAString(actualString));
	}
}