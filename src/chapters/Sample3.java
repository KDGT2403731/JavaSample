package chapters;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力");
		int input = extracted().nextInt();
		for (int n : numbers) {
			if (n == input) {
				System.out.println("アタリ！");
			}
		}
	}

	private static Scanner extracted() {
		return new java.util.Scanner(System.in);
	}

}
