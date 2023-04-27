
package dfghj;
import java.util.Scanner;
public class SecondLastChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		System.out.println("Enter character");
		char c=sc.next().charAt(0);
		int n=s.length();
		int a=0;
		char [] arr=new char[n];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				arr[a]=s.charAt(i);
				a++;
			}
			
		}
		if(a==0) {
			System.out.println("Not present");
		}else if(a==1) {
			System.out.println("No two occurance");
		}else {
			System.out.println(c+" is present at "+(a-1)+" index");
		}
	}

}

// Better code for the same question

import java.util.Scanner;

public class SecondLastChar {

	public static void main(String[] args) {
		String s = "Hi how are you?";
		int i, count = 0;
		for (i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == 'o') {
				count++;
			}
			if (count == 2) {
				break;
			}
		}
		if (count == 0) {
			System.out.println("Not found");
		} else if(count==2) {
			System.out.println("second last at index " + i);
		}
		else {
			System.out.println("Found at index " + i);
		}
	}

}
