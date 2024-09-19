package Java2;

public class vovelsinString {

	public static void main(String[] args) {
		int vCount = 0, cCount = 0;
		String str = "This is a really simple sentensce";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cCount++;
			}
			System.out.println("number of vwels" + vCount);
			System.out.println("number of constant" + cCount);
		}

	}
}
