import java.util.Scanner;

public class Solution_2 {
	//problem 71A Way Too Long Words
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int lines = sc.nextInt();
			int i = 0;
			while(i <= lines) {
				String s = sc.nextLine(); //input string
				String r = ""; //our result
				if(s.length() > 10) {
					r = s.charAt(0) + "" + (s.length()-2) + "" + s.charAt(s.length()-1); //put the first letter then the size minus the first and last letter then the last letter of the string
					System.out.println(r);
				} else { // if not greater than 10 then return as is...
					System.out.println(s);
				}
				i++;
			}
		}
}
