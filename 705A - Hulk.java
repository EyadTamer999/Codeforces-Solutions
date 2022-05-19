import java.util.Scanner;

public class Solution_2 {

	public static void main(String[] args) {
	//705A HULK
	// if n is odd last phrase will be "i hate it", if it is even then the last phrase will be "that i love it"...
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	// loop over and keep printing
	for(int i = 0; i < n; i++) {
		if(i % 2 == 0)
			System.out.print("I hate ");
		else
			System.out.print("I love ");
		if (i != n - 1)
	            System.out.print("that ");
	    else
	        	System.out.print("it ");
		}
	}
}
