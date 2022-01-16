package InterviewPrograms;

public class ThirdMAxNumberInArray {

	public static int Max3Array(int[] a) {
		int temp,total = 0;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-3];  
	}
	public static void main(String[] args) {
		int a[]= {1,2,9,4,5,7};
		System.out.println(Max3Array(a));
	}
}
