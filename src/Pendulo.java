/**
 * 
 * @author Izan
 * @version 1.0
 */
public class Pendulo {

	public static final double GRAVEDAD=9.8;
	
	
	/**
	 * 
	 * @param longitud, de tipo double
	 * @return Devuelve el resultado de calcular el periodo
	 */
	public static double calcularPeriodo(double longitud) {

		return 2*Math.PI*(Math.sqrt(longitud/GRAVEDAD));

	}
}
