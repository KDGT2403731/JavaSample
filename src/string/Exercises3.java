package string;

public class Exercises3 {
	public static String removeVowelsWithStringBuilder(String input) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (!"aeiouAEIOU".contains(String.valueOf(c))) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(removeVowelsWithStringBuilder("Hello World"));
	}

}
