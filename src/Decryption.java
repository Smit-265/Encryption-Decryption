import java.util.Scanner;

public class Decryption {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a text for Decryption");
		String text = in.next();
		System.out.print("Enter a key value : ");
		int key = in.nextInt();
		char[] chars = text.toCharArray();
		for(char c: chars){
			c -= key;
			System.out.print(c);
		}
	}
}
