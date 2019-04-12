package com.expertla;

import java.util.Scanner;

/**
 * 
 * @author Steven Rivas Jaimes
 *
 */
class PascalTriangle {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese n: ");
			int n = sc.nextInt();
			sc.close();
			constructionPascalTringle(0, n);
		} catch (Exception e) {
			System.out.println("Ocurrió un problema al generar el triangulo.");
		}
	}
	/**
	 * Contiene los métodos que construye el triángulo recursivamente
	 * 
	 * @param currentNumber
	 * @param n
	 */
	public static void constructionPascalTringle(int currentNumber, int n) {
		if (currentNumber < n) {
			int k = 0;
			printSpace(currentNumber, n, k);
			printTriangle(0, currentNumber);
			System.out.println();
			constructionPascalTringle(currentNumber + 1, n);
		}
	}

	/**
	 * Imprime los espcios del triangulo
	 * 
	 * @param currentNumber
	 * @param n
	 * @param k
	 */
	private static void printSpace(int currentNumber, int n, int k) {
		if (k < n - currentNumber) {
			System.out.print(" ");
			printSpace(currentNumber, n, k + 1);
		}
	}

	/**
	 * Se realiza la operación para obtener el triangulo
	 * 
	 * @param currentNumber
	 * @param j
	 * @return
	 */
	private static int pascalTriangle(int currentNumber, int j) {
		if (j == 0 || j == currentNumber) {
			return 1;
		} else {
			return pascalTriangle(currentNumber - 1, j - 1) + pascalTriangle(currentNumber - 1, j);
		}
	}

	/**
	 * Imprime los valores del triangulo
	 * 
	 * @param j
	 * @param currentNumber
	 */
	private static void printTriangle(int j, int currentNumber) {
		if (j <= currentNumber) {
			System.out.print(pascalTriangle(currentNumber, j) + " ");
			printTriangle(j + 1, currentNumber);
		}
	}
}
