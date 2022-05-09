import java.util.Scanner;

public class Solution_2 {

	public static void main(String[] args) {
		
		//they need to tell whether it is even or not, so basically check if it can be an even number or not...
		
		Scanner sc = new Scanner(System.in);
		int kilo = sc.nextInt();
		
		if(kilo <= 1 || kilo <= 100)
			System.out.println(waterMelon(kilo));
		else
			System.out.println("NO");
	}

	public static String waterMelon(int i) {
		if(i % 2 == 0)
			return "YES";
		else
			return "NO";
	}

	
}
