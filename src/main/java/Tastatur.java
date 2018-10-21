import java.util.InputMismatchException;
import java.util.Scanner;

public class Tastatur {
	
	// geklaut  
	// https://entwickler-forum.de/showthread.php/61067-If-Schleife-pr%C3%BCfe-ob-Eingabe-ein-Int-ist
	
	public static String liesString(String ausgabe) {
		String rs = null;
		boolean error = true;
		while (error) {
			Scanner sc = new Scanner(System.in);
			System.out.println(ausgabe);
			try {
				rs = sc.next();
				error = false;
			} catch (InputMismatchException e) {
				error = true;
				System.out.println("Bitte einen String eingeben!!");
			}
		}
		return rs;
	}

	public static int liesInt(String ausgabe) {
		int rs = 0;
		boolean error = true;
		while (error) {
			Scanner sc = new Scanner(System.in);
			System.out.println(ausgabe);
			try {
				rs = sc.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				error = true;
				System.out.println("Bitte eine Ganzzahl eingeben!!");
			}
		}
		
		return rs;
	}

	public static double liesDouble(String ausgabe) {
		double rs = 0;
		boolean error = true;
		while (error) {
			Scanner sc = new Scanner(System.in);
			System.out.println(ausgabe);
			try {
				rs = sc.nextDouble();
				error = false;
			} catch (InputMismatchException e) {
				error = true;
				System.out.println("Bitte eine Ganz- oder Kommazahl eingeben!!");
			}
		}
		return rs;
	}
}