import java.util.Scanner;

public class TestPendulo {
	public static void main (String[] args) {
		
		System.out.println("Introduzca longitud: ");
		Scanner sc = new Scanner(System.in);
		
		double longitud = sc.nextDouble();
		sc.close();
		
		double periodo=Pendulo.calcularPeriodo(longitud);
		System.out.printf("Longitud del p�ndulo: %f tiene un periodo de oscilaci�n de: %f",longitud,periodo);
	}
}
