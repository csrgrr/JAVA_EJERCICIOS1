import java.util.Scanner;

public class Ejercicio2 {
//2.- Crea una etructura condicional que evalúe si una edad introducida por consola es mayor o igual a 18, si es así, imprimir por la consola: "Eres  mayor de edad" caso contrario imprimir "eres menor de edad".

	public static void main(String[] args) {
		Scanner escan = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int edad = escan.nextInt();
		if(edad >= 18)
			System.out.println("Eres mayor de edad");
		else
			System.out.println("Eres menor de edad");
		escan.close();
	}
	
}
