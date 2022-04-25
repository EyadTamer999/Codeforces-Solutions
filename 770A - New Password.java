import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int k = sc.nextInt();
		
		System.out.println(psswdGen(n,k));
	}

	private static String psswdGen(int n, int k) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String psswd = "";
		
		for(int i = 0; i < n; i++) {
			psswd += alphabet.charAt(i%k);
		}
		return psswd;
	}	
}
