package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Practice3 {

	public static void main(String[] args) {
		ArrayList<String> fruits1 = new ArrayList<>();
		fruits1.add("apple");
		fruits1.add("banana");
		fruits1.add("orange");
		ArrayList<String> fruits2 = new ArrayList<>();
		fruits2.add("grape");
		fruits2.add("kiwi");
		fruits2.add("melon");
		ArrayList<String> combinedFruits = new ArrayList<>(fruits1);
		combinedFruits.addAll(fruits2);
		Collections.sort(combinedFruits);
		System.out.println(combinedFruits);
	}

}
