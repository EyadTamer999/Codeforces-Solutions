import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution_2 {

	public static void main(String[] args) throws IOException {
	//677A Vanya and Fence
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	// if taller than h then bend = 2, else bend = 1
	// we need to calc the total width or total bend
	
	String lengthAndFenceHeight[] = br.readLine().split(" ");

	
	int a[] = new int[Integer.parseInt(lengthAndFenceHeight[0])];
	int h = Integer.parseInt(lengthAndFenceHeight[1]);
	String p[] =  br.readLine().split(" ");
	int bend = 0;
	for(int i = 0; i < a.length; i++) {
		a[i] =Integer.parseInt(p[i]);
		if(a[i] > h) {
			bend += 2;
		}else {
			bend++;
		}
	}
	System.out.println(bend);
	}
}
