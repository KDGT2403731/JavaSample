package calculator;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BasicCalculator calc = new BasicCalculator();
		CalculatorHistory history = new CalculatorHistory();
		
		int resultAdd = calc.add(5, 3);
		history.saveToHistory("5 + 3 = " + resultAdd);
		
		int resultSub = calc.subtract(10, 4);
		history.saveToHistory("10 - 4 = " + resultSub);
		
		int resultMul = calc.multiply(6, 7);
		history.saveToHistory("6 * 7 = " + resultMul);
		
		double resultDiv = calc.divide(20, 4);
		history.saveToHistory("20 / 4 = " + resultDiv);
		
		history.printHistory();
	}

}
