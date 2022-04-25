
public class Solution {

	public static void main(String[] args) {
		
		//they need to tell wheather it is even or not, so basically check if it can be an even number or not...
		
		System.out.println(waterMelon(8));
	}

	public static String waterMelon(int i) {
		if(i % 2 == 0)
			return "Yes";
		else
			return "No";
	}

	
}
