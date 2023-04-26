import java.util.Scanner;

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
			if (Character.isLowerCase(s.charAt(0)) && s.contains("@") && s.endsWith(".com") || s.endsWith(".in") || s.endsWith(".org")) {
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
