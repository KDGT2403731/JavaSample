package collections;

import java.util.ArrayList;

public class Practice2 {
	public static void main(String[] args) {
		ArrayList<String> members = new ArrayList<>();
		members.add("kirishima");
		members.add("midorikawa");
		members.add("rokumura");
		ArrayList<String> members_copy = new ArrayList<>(members);
		System.out.println("members:" + members);
		System.out.println("members_copy:" + members_copy);
	}
}
