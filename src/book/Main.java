package book;

public class Main {
	public static void main(String [] args) {
		Book myBook = new Book("吾輩は猫である", "夏目漱石");
		myBook.displayInfo();
	}
}

class Book {
	private String title;
	private String author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public void displayInfo(){
        System.out.println("タイトル: " + title + ", 著者: " + author);
    }
}