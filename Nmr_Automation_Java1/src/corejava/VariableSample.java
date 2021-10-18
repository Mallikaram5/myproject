package corejava;
public class VariableSample {
	public static void main(String[] args) {
		add();
		sub();}
	// Global Variable
	static int a = 100;
	static int b = 50;
	public static void add() {
		// Local Variable
		int a = 90;
        int b = 80;
		System.out.println(a + b);
	}
	public static void sub() {
		// Local Variable
        int a = 200;
		int b = 45;
		System.out.println(a - b);
	}}



