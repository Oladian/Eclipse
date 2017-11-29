import java.util.Scanner;

public class TestPendulo {
	public static void main (String[] args) {
		
		System.out.println("Introduzca longitud: ");
		Scanner sc = new Scanner(System.in);
		
		double longitud = sc.nextDouble();
		sc.close();
		
		double periodo=Pendulo.calcularPeriodo(longitud);
		System.out.printf("Longitud del péndulo: %f tiene un periodo de oscilación de: %f",longitud,periodo);
	}
}
