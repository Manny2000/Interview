package Javafunctions;

import java.util.Scanner;

public class reverseint2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		int orignal = scan.nextInt();
		int reverse = 0;
		int remainder;
		while (orignal != 0) {
			remainder = orignal % 10;
			reverse = reverse * 10 + remainder;
			orignal = orignal / 10;
		}
		System.out.println(reverse);
	}

}
