package SUMA.java.src;

import java.util.Scanner;

public class Calculadora {
    static Scanner teclado = new Scanner(System.in);

	public static void suma() {

		double a, b, c;

		System.out.println("A :");
		a = teclado.nextDouble();

		System.out.println("B :");
		b = teclado.nextDouble();

		c = a + b;
		System.out.println("RESULTADO :" + c);
	}

	public static void resta() {
		double a, b, c;

		System.out.println("A :");
		a = teclado.nextDouble();

		System.out.println("B :");
		b = teclado.nextDouble();

		c = a - b;
		System.out.println("RESULTADO :" + c);

	}

	public static void multi() {

		double a, b, c;

		System.out.println("A :");
		a = teclado.nextDouble();

		System.out.println("B :");
		b = teclado.nextDouble();

		c = a * b;
		System.out.println("RESULTADO :" + c);

	}

	public static void division() {
		Double a, b, c;

		System.out.println("A :");
		a = teclado.nextDouble();

		System.out.println("B :");
		b = teclado.nextDouble();


			System.out.println("Error...");
			if (a==0 ||b==0) {
		}
		
		c = a / b;
		System.out.println("RESULTADO :" + c);
	}

	public static void menu() {

		System.out.println("**** MENU *****");
		System.out.println("1. Suma ");
		System.out.println("2. resta");
		System.out.println("3. multi ");
		System.out.println("4. division ");
		System.out.println("5. Salir");
		System.out.println("Elige una opcion del 1-5 : ");

	}

	public static void main(String[] args) {

		int opcion;

		do {

			menu();
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:

				suma();

				break;

			case 2:

				resta();

				break;

			case 3:

				multi();

				break;
			case 4:

				division();

				break;

			default:

				System.out.println("Gracias por su visita ...");
				break;
			}
		} while (opcion != 5);

	}

}