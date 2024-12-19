import java.util.Scanner;

public class LengthofString {

	public static void main(String[] args) {
		// method calling
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		String s = sc.nextLine();
		lengthOfString(s);

		sc.close();
	}
//method declartion
	public static void lengthOfString(String s) {
		char[] a = s.toCharArray();

		System.out.println("the length of String " + a.length);
	}

}