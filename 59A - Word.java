import java.util.Scanner;

public class Solution_2 {
 
	public static void main(String[] args) {
		
		//Basically if we have more lowercase than uppercase then the whole string is lowercase and vice versa
		
		//input: HoUse
		//output: house
		
		//ViP
		//VIP
		
		//if == then lowercase
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		
		System.out.println(caseChecker(word));
	}
 
	public static String caseChecker(String s) {
		byte count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == Character.toUpperCase(s.charAt(i))) {
				//incase of a char in the string is Uppercase then count++
				count++;
			}
		}
		if(count > s.length()/2)
			return s.toUpperCase();
		else
			return s.toLowerCase();
	}
}
