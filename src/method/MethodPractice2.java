package method;

public class MethodPractice2 {

	public static void main(String[] args) {
		showTriangle(3);
		System.out.println("-----");
		showTriangle(5);
	}
	public static void showTriangle(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
