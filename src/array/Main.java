package array;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// 1
		Player player = new Player();
		// 2
		String language = "Java";
		// 3
		Integer value = 42;
		// 4
		ArrayList<String> items = new ArrayList<String>();
		System.out.println(player + "を作成しました");
		System.out.println("使用言語:" + language);
		System.out.println("値:" + value);
		System.out.println("アイテム数:" + items.size());
	}
}

class Player{
	//Playerの定義
}