import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution_2 {

	public static void main(String[] args) {
	//200B Drinks
	// divide each drink % over total number of drinks to get res
	Scanner sc = new Scanner(System.in);
	double n = sc.nextInt();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String lines = null;
	try {
		lines = br.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   
	String[] d = lines.trim().split(" ");
	double res = 0;
	for(int i = 0; i < d.length; i++) {
		if(d[i] != null)
		res += Integer.parseInt(d[i])/n;
	}
	System.out.println(res + "");
	
	}
}
