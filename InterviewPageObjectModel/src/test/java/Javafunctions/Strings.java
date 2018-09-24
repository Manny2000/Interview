package Javafunctions;

public class Strings {
	// how many times a character appears in a string?

	public static void main(String[] args) {

		char b = 'm';
		// char[] c = b.toCharArray();
		String a = "My name is Mansoor";

		// char[] d = a.toCharArray();
		// We need to find out how many times this string has M
		int counter = 0;

		for (int i = 0; (i <= a.length() - 1); i++) {
			if (a.charAt(i) == (b)) {
				counter = counter + 1;
			}
		}
		System.out.println(counter);
	}

}
