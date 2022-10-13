package string.exercise;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "     ";	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string which you want to reverse : ");
		s=sc.nextLine();
		String reverse= "";
		for(int i=s.length()-1; i>=0;i--) {
			reverse= reverse+(s.charAt(i));
		
		}
		System.out.println(reverse);
			sc.close();
	}

}
