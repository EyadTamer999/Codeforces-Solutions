import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution_2 {

	public static void main(String[] args) throws IOException {
		//791A Bear and Big Brother
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] line = input.split(" ");
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);
		int count = 0;
		do {
			count++;
			a *= 3;
			b *= 2;
		}while(a <= b);
		System.out.println(count);
	}
}
