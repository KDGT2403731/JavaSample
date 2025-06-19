package string;

public class Exercises5 {
	public static String reverseWords(String sentence) {
		String[] words = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]);
			if (i != 0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(reverseWords("Hello World Java"));
	}

}
