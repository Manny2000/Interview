package Javafunctions;

public class StringA_in_B {

	// How many times Mansoor from String A appears in String B?

	public static void main(String[] args) {
		String a = "Mansoor";
		String b = "This is a string Sadaf";
		
		String[] aa = a.split(" ");
		String[] bb = b.split(" ");
		int j = 0; // Number of times Duplicate word appears in String b
		String k = "";
		for (int i = 0; i <= aa.length - 1; i++) {
			// System.out.print(aa[i] + " ");

			for (int ii = 0; ii <= bb.length - 1; ii++) {
				// System.out.print(bb[ii] + " ");
				if (aa[i].equals(bb[ii])) {
					j = j + 1; // increments each time there is a duplicate.
					k = aa[i]; // gives the matched word each time the loops runs.
				}
			}
			if (k == "") {
				System.out.println("No match found");

			} else {
				System.out.println("Matching word is :: " + k);
				System.out.println("It appears " + j + " times in the second string");
			}
		}
	}
}