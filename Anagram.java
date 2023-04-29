package dfghj;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string");
		String s = sc.nextLine();
		System.out.println("Enter 2nd string");
		String t = sc.nextLine();
		boolean flag=false;
		int count=0;
		if (s==null || t==null || s.length()==t.length()) {
			for (int i = 0; i < s.length(); i++) {
				count=0;
				for (int j=0;j<t.length();j++) {
					if(s.charAt(i)==t.charAt(j)) {
						count++;
					}
				}
				if(count==0) {
					flag=true;
					break;
				}
			}
				
		
		if(flag==true) {
			System.out.println("Not Anagram");
		}else {
			System.out.println("Is Anagram");
		}
		}else {
			System.out.println("Strings are not valid");
		}
	}

}
