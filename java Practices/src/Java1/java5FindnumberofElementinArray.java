package Java1;

public class java5FindnumberofElementinArray {

	public static void main(String[] args) {
		int a[] = { 1, 1, 1, 1, 11, 1, 1, 11, 1, 1, 11, 1, 1, 1, 1 };
		int count = 0, i = 0, n;
		try {
			while (a[i] != 'a') {
				count++;
				i++;
			}
		} catch (Exception e) {
			System.out.println("Number of element in Array" + count);
		}
		n = a.length;
		System.out.println("number of element" + n);
	}

}
