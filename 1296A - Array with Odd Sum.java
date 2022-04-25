
public class Solution {

	public static void main(String[] args) {
		
		int a[] = {5,3,4,2};
		
		System.out.println(oddSum(a));
	}

	private static String oddSum(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		if(sum % 2 != 0)
			return "YES";
		else
			return "NO";
	}



	
}
