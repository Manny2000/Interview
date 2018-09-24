package Javafunctions;

public class reverseint {

	public static void main(String[] args) {
		int value = 123245;
		int resultNumber = 0;
		for (int i = value; i != 0; i /= 10) {
			resultNumber = resultNumber * 10 + i % 10; //i % means remainder while dividing my ten
		}
		System.out.println(resultNumber);
	}
}
