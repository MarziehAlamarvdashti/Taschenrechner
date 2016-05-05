package main;

import java.util.Scanner;

public class Calculator {

	public static double add(double a, double b) {
		double result = 0;
		result= a + b;
		return result;
	}

	public static double minus(double a, double b) {
		double result = 0;
		result= a - b;
		return result;
	}

	public static double multiply(double a, double b) {
		double result = 0;
		result= a * b;
		return result;
	}

	public static double divide(double a, double b) {
		double result = 0;
		if (b==0){
			return -1;
		}
		result= a / b;
		return result;
	}

	public static double numericalGradient(double x) {
		double result = 0;
		double h = 0.00001;
		result= (Math.log (x + h)- Math.log(x - h)) / 2*h;
		return result;
	}

	public static int ggT(int a, int b) {		
		 while (b != 0) {
		     if (a > b) {
		       a = a - b;
		     } else {
		       b = b - a;
		     }
		   }
		 
		   return a;		
	}

	public static int kgV(int a, int b) {
		int result = 0;
		result = (Math.abs(a * b) / ggT(a,b));
		return result;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// conversation
		boolean on = true;
		while (on) {

			System.out.println("Wilkommen beim Taschenrechner!");

			System.out.println("Operation:");
			System.out.println("1. Plus");
			System.out.println("2. Minus");
			System.out.println("3. Multiplizieren");
			System.out.println("4. Dividieren");
			System.out.println("5. Ableitung");
			System.out.println("6. ggT");
			System.out.println("7. kgV");
			System.out.println("8. Beenden");

			int input = scanner.nextInt();
			double x = 0;
			double y = 0;
			int a = 0;
			int b = 0;

			if (input == 5) {
				System.out.println("Bitte gib einen Wert fuer x ein:");
				x = scanner.nextDouble();
			} else if (input == 6) {
				System.out.println("Bitte gib die erste Zahl ein:");
				a = scanner.nextInt();
				System.out.println("Bitte gib die zweite Zahl ein:");
				b = scanner.nextInt();
			} else if (input == 7) {
				System.out.println("Bitte gib die erste Zahl ein:");
				a = scanner.nextInt();
				System.out.println("Bitte gib die zweite Zahl ein:");
				b = scanner.nextInt();
			} else if (input == 8) {

			} else {
				System.out.println("Bitte gib die erste Zahl ein:");
				x = scanner.nextDouble();
				System.out.println("Bitte gib die zweite Zahl ein:");
				y = scanner.nextDouble();
			}

			switch (input) {
			case 1:
				System.out.println(add(x, y));
				break;
			case 2:
				System.out.println(minus(x, y));
				break;
			case 3:
				System.out.println(multiply(x, y));
				break;
			case 4:
				System.out.println(divide(x, y));
				break;
			case 5:
				System.out.println(numericalGradient(x));
				break;
			case 6:
				System.out.println(ggT(a, b));
				break;
			case 7:
				System.out.println(kgV(a, b));
				break;
			case 8:
				on = false;
				break;
			default:
				System.out.println("Bitte gib eine Zahl zwischen 1 und 8 ein!");
				break;
			}
		}

		scanner.close();
	}

}