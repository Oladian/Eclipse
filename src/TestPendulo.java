import java.util.Scanner;

public class TestPendulo {
	public static void main (String[] args) {
		
		System.out.println("Longitud");
		Scanner sc = new Scanner(System.in);
		
		double longitud = sc.nextDouble();
		sc.close();
		
		double periodo=Pendulo.calcularPeriodo(longitud);
		System.out.println("Longitud: "+longitud+"- periodo: "+periodo);
	}
}
