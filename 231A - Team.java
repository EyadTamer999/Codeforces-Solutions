import java.util.Scanner;

public class Solution_2 {

	public static void main(String[] args) {
		// 231A - Team
		Scanner sc = new Scanner(System.in);
		int problems = sc.nextInt(); // no of problems 
		int canBeSolved = 0;
		
		// if 2 or more agree then the problem can be solved
		
		for(int i = 0; i < problems; i++) {
				int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
				int count = 0;
				if(a == 1) 
					count++;
				if(b == 1) 
					count++;
				if(c == 1) 
					count++;
				if(count >= 2)
					canBeSolved++;		
		}
		System.out.println(canBeSolved);
	}


}
