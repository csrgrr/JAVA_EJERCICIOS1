import java.util.Scanner;

public class Ejercicio5 {
	//5.- Crea un programa que pida un número por consola entre el 1 y el 50. Si el número está fuera de este rango imprimir "El número no es válido" y seguir pidiendo números hasta que el número esté en ese rango. Si el número es válido crea la lógica para verificar si dicho número es par o impar. Si es par imprimir por consola "Número par" y, si es impar, "Número impar".
	//La lógica para averiguar si el número es par o impar debe de estar fuera del archivo que contiene el método main en una carpeta llamada "utils" y en una clase llamada EjercicioCinco Además esta lógica debe estar ejecutada a través de un método.

	   
	
	public static void main(String[] args) {
	int num = 0;
	boolean exitClause = false;
	new EjercicioCinco();
	Scanner escan = new Scanner(System.in);
	while(exitClause != true) {	
	
	System.out.println("Introduce un numero:");
	num = escan.nextInt();
		if (num >= 1 && num <=50) {
			boolean comprobador = EjercicioCinco.comprobadorDePar(num);
			if (comprobador)
				System.out.println("es par");
			else 
				System.out.println("es impar");
			
			exitClause = true;
		}
		else {

			System.out.println("El numero no es valido.");
		}
		
	};
	escan.close();
}
}
