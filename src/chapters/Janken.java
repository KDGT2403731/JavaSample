package chapters;

import java.util.Random;
import java.util.Scanner;

public class Janken {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("じゃんけん（グー・チョキ・パー）を入力してください：");
		String user = scanner.nextLine();
		Random random = new Random();
		int cpuNum = random.nextInt(3);
		String cpu = "";
		if (cpuNum == 0) {
		cpu = "グー";
		} else if (cpuNum == 1) {
		cpu = "チョキ";
		} else {
		cpu = "パー";
		}
		System.out.println("あなたの手：" + user);
		System.out.println("コンピューターの手" + user);
		if (user.equals(cpu)) {
			System.out.println("あいこです");
		} else if (
		(user.equals("グー") && cpu.equals("チョキ")) ||
		(user.equals("チョキ") && cpu.equals("パー")) ||
		(user.equals("パー") && cpu.equals("グー"))
		) {
		System.out.println("あなたの勝ちです！");
		} else {
		System.out.println("あなた負けです・・・");
		}
		scanner.close();
	}

}
