package InterviewPrograms;

public class CountNoOfAlphaNumerics {

	public static void main(String[] args) {

		String str = "aabbbaacccbaa";
		int len1 = str.length();

		int len2 = str.replace("a", "").length();
		int count =len1-len2;
		
		System.out.println("The occurence of a is:"+count);
	}
}