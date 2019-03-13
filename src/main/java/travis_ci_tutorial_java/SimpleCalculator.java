package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public double divide(int a, int b) {
		return Math.round((a / b) * 100) / 100.0;
	}
}// end of SimpleCalculator class
