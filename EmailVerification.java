import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of emails");
		int n = sc.nextInt();
		int i = 0;
		String[] arr = new String[n];
		while (i < n) {
			String s = sc.next();
			arr[i] = s;
			if (Character.isLowerCase(s.charAt(0)) && Pattern.matches("[a-zA-Z0-9._%+-]+[@][a-zA-Z0-9.-]+[.](com|in|org)", s) && !Pattern.matches("[~!$%^&*_=+\\}\\{\\'?\\-.]+", s)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
				i--;
			}
			for (int j=0;j<i;j++) {
			if (s.equals(arr[j]) ) {
				System.out.println("Duplicate not allowed");
				i--;
				break;
			}
			}
			i++;
		}
		
		sc.close();
	}

}
