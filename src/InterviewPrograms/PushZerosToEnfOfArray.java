package InterviewPrograms;

public class PushZerosToEnfOfArray {

	// input--> int arr[] = {1,5,8,3,0,3,0,2,0,7,0};
	// output--> int arr[] = {1,5,8,3,3,2,7,0,0,0,0};

	public static void PushZerosEnd(int[] arr, int n) {

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while (count < n)
			arr[count++] = 0;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 8, 3, 0, 3, 0, 2, 0, 7, 0 };
		int n = arr.length;

		PushZerosEnd(arr, n);
		System.out.println("Array after pushing Zeros to back: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + ",");
		}
	}
}
