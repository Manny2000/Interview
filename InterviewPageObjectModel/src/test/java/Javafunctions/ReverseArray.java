package Javafunctions;

public class ReverseArray {
	public static void main(String[] args) {
		String orignalstring = "My name is Mansoor, and I hate Sadaf";
		// Split the string in to different words separating by a space
		String[] converted = orignalstring.split(" ");

		int lengthofarray = converted.length;

		System.out.println("Orignal array is:");

		for (int i = 0; i <= lengthofarray - 1; i++) {
			System.out.print(converted[i] + " ");
		}

		System.out.println();
		System.out.println("Reversed array is:");

		for (int i = lengthofarray - 1; i >= 0; i--) {
			System.out.print(converted[i] + " ");
		}
	}

}

// String[] arrOfStr = str.split("@", 2);
