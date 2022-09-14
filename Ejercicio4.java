import java.util.Scanner;

public class Ejercicio4 {
//4.- Crea un programa en java que pida introducir un número por consola. El programa pedirá siempre un número mientras que éste no sea el 5 y cuando así sea imprimir "Fin del programa"
	//terminando asi dicho programa
	
	public static void main(String[] args) {
		Scanner escan = new Scanner(System.in);
		int num = 0;
		while(num != 5) {
		System.out.println("Introduce un numero:");
		num = escan.nextInt();
		};
		System.out.println("Enhorabuena, has averiguado que el numero era " + num);
	escan.close();
	}
}
