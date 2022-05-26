import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Solution_2 {
 
	public static void main(String[] args) throws IOException {
	//200B Drinks
	// divide each drink % over total number of drinks to get res
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String tmp = br.readLine();
    String m[] = tmp.split(" ");
    double n = Integer.parseInt(m[0]);
	String lines = br.readLine(); 
	String[] d = lines.split(" ");
	double res = 0;
	for(int i = 0; i < d.length; i++) {
		if(d[i] != null)
		res += Integer.parseInt(d[i])/n;
	}
	System.out.println(res + "");
	
	}
}
