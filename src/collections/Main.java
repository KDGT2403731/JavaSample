package collections;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> original = new ArrayList<>();
		original.add("apple");
		original.add("banana");
		ArrayList<String> copy = new ArrayList<>(original);
		copy.add("cherry");
		System.out.println(original);
		System.out.println(copy);
	}
}
