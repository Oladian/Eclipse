package repaso;
/**
 * Clase Repaso, en la que se explican dudas
 * @author Izan
 * @version 1.2
 */

public class Repaso {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i%2!=0) { //cuando no es numero par continua iterando
				continue; 
			}
			if (i==4) continue; 
		//	if (i==8) return; //Saca del método void
			System.out.println("Valor "+i);	
		}
		System.out.println("Final");
		
		int numero=Integer.parseInt(args[0]);
		double mitad = calcularMitad(numero);
		System.out.printf("La mitad de %d es %f",numero,mitad);
		String cadena = new String("Nos van a hinchar en el examen de programación");
		System.out.printf("%nLa cadena \"%s\" tiene %d ",cadena,cadena.length());
		System.out.printf("%nLa el caracter de la cadena \"%s\" en la posicion 2 es: %s ",cadena,cadena.charAt(2));
	}
/**
 * 
 * @param numero
 * @return El numero introducido como argumento dividido entre 2
 */
	public static double calcularMitad (int numero){
		return numero/2;
	}
}
