package oopIntroQuotes;

public class Calculator {
	int memory;

	/**
	 * @param memory
	 */
	public Calculator() {
		super();

	}

	/**
	 * @return the memory
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}

	/**
	 * Clear memory - using 0 as base memory
	 */
	public void clearMemory() {
		memory = 0;
	}

	/**
	 * Add
	 */
	public int addNumbers(int a, int b) {
		return a+b;
	}

	/**
	 * Subtract
	 */
	public int subtract(int a, int b) {
		return a-b;
	}

	/**
	 * Multiply
	 */
	public int multiply(int a, int b) {
		return a*b;
	}

	/**
	 * Divide
	 */
	public int divide(int a, int b) {
		return a/b;
	}

	/**
	 * Sqrt
	 */
	public int sqrt(int a) {
		return (int) Math.sqrt(a);
	}
}
