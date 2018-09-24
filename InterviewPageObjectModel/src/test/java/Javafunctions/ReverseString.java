package Javafunctions;

public class ReverseString {

	public static void main(String[] args) {
		String OrignalString = "This is a String";

		System.out.println("Orignal string is:" + "\n" + OrignalString);
		// int Size = OrignalString.length();
		// System.out.println(Size);

		System.out.println("String in reverse order is:");
		for (int i = (OrignalString.length() - 1); i >= 0; i--) {
			System.out.print(OrignalString.charAt(i));
		}
	}
}