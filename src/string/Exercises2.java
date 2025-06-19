package string;

public class Exercises2 {
	public static int countChar(String str, char target) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int charCount = countChar("Hello World", 'l');
		System.out.println(charCount);
	}

}
