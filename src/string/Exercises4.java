package string;

public class Exercises4 {
	public static boolean isPalindrome(String input) {
		String cleaned = input.replaceAll("[^a-zA-Z-0-9]", "").toLowerCase();
		String reversed = new StringBuilder(cleaned).reverse().toString();
		return cleaned.equals(reversed);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(isPalindrome("level"));
		System.out.println(isPalindrome("hello"));
	}

}
