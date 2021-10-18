package corejava;

import java.util.Scanner;

public class ScannerSample {

//	private static Scanner sc;

	public static void main(String[] args) {
		int a;
		int b;
	Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("*-*-*-*-*-*-*-*-*--*");
		System.out.println("Addition: "+(a + b));
		System.out.println("SUB: "+(a - b));		
		System.out.println("MUL: "+(a * b));
	}

}

