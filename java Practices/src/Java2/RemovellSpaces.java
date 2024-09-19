package Java2;

public class RemovellSpaces {

	public static void main(String[] args) {

		String str = "     I  nd  ia i  s    mycountry   ";
		// first Way
		String noSpaceStr = str.replaceAll("\\s", "");
		System.out.println(noSpaceStr);
		// Second Way
		char[] strArray = str.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
				stringBuffer.append(strArray[i]);
			}
		}
		String noSpaceStr2 = stringBuffer.toString();
		System.out.println(noSpaceStr2);

	}

}
