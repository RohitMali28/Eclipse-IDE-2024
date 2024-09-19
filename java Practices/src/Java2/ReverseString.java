package Java2;

public class ReverseString {

	public static void main(String[] args) {
		String input = " my name is rohit";
		StringBuffer buffer = new StringBuffer(input);
		String reversed = buffer.reverse().toString();
		System.out.println(reversed);

	}

}
