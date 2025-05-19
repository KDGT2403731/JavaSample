package calculator;

public class CalculatorHistory {
	private String[] history = new String[10];
	private int historyIndex = 0;
	
	public void saveToHistory(String calculation) {
		if (historyIndex < 10) {
			history[historyIndex] = calculation;
			historyIndex++;
		} else {
			for (int i = 0; i < 9; i++) {
				history[i] = history[i + 1];
			}
		}
		history[9] = calculation;
	}
	public void printHistory() {
		System.out.println("計算履歴：");
		for (int i = 0; i < historyIndex; i++) {
			System.out.println(history[i]);
		}
	}

}
