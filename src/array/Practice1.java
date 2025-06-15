package array;
import java.util.ArrayList;

public class Practice1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 1
		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("apple");
		fruit.add("orange");
		fruit.add("banana");
		System.out.println(fruit);
		// 2
		String getFruit = fruit.get(1);
		System.out.println(getFruit);
		System.out.println();
		// 3
		fruit.add(0, "strawberry");
		// 4
		fruit.set(2, "grape");
		// 5
		boolean hasApple = fruit.contains("apple");
		System.out.println(hasApple);
		fruit.remove("apple");
		System.out.println(fruit);
	}

}
