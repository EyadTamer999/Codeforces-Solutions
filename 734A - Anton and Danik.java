import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Solution_2 {
 
	public static void main(String[] args) throws IOException {
	//734A - Anton and Danik
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int gamesPlayed = Integer.parseInt(br.readLine());
    String winner = br.readLine();
    int Acount = 0;
    int Dcount = 0;
    for(int i = 0; i < gamesPlayed; i++) {
    	if(winner.charAt(i) == 'A')
    		Acount++;
    	else
    		Dcount++;
    }
    if(Acount > Dcount)
    	System.out.println("Anton");
    else if(Dcount  > Acount)
    	System.out.println("Danik");
    else
    	System.out.println("Friendship");
	}    
}
