/**
 * 
 * @author Izan
 *
 */
public class Pendulo {

	public static final double GRAVEDAD=9.8;
	
	public static double calcularPeriodo(double longitud) {

		return 2*Math.PI*(Math.sqrt(longitud/GRAVEDAD));

	}
}
