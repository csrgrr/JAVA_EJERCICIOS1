import java.util.Scanner;

public class Ejercicio3 {
//3.- Crea un programa en java que pida dos datos por la consola al usuario: nombre e email. Imprime el valor de estás variables por consola.

	public static void main(String[] args) {
		Scanner escan = new Scanner(System.in);
		System.out.println("Introduce tu nombre de usuario:");
		String nom = escan.nextLine();
		System.out.println("Introduce tu email:");
		String mail = escan.nextLine();
		System.out.println("Tu nombre de usuario es: " + nom);
		System.out.println("Tu mail es: " + mail);
		escan.close();
		
	}
	}
	
	
	
