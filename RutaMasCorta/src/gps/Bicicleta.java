package gps;

/**
 * Bicicleta class
 * 
 * @Java IES Severo Ochoa @2.0
 */

public class Bicicleta {
	public Bicicleta() {
		int ruedas = 4;
		boolean luces = false;
		String marca = "Orbea";
	}
	/**
	 * Método que suma todos los tramos (km) de una ruta.
	 * @param camino array que contiene los tramos de una ruta.
	 * @return suma int devuelve la suma de los tramos(km) de una ruta.
	 */
	public static int sumaRuta(int[] camino) {
		int suma = 0;

		for (int i = 0; i < camino.length; i++) {
			suma += camino[i];
		}
		return suma;
	}
	/**
	 * Método que compara la longitud de tres caminos.
	 * @param camino1 array que contiene los datos de una ruta.
	 * @param camino2 array que contiene los datos de una ruta.
	 * @param camino3 array que contiene los datos de una ruta.
	 * @return String devuelve el camino mas corto.
	 */
	public static String rutaCorta(int[] camino1, int[] camino2, int[] camino3) {
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		sum1 = sumaRuta(camino1);
		sum2 = sumaRuta(camino2);
		sum3 = sumaRuta(camino3);

		if (sum1 < sum2 && sum1 < sum3) {
			return "camino 1";
		} else if (sum2 < sum3 && sum2 < sum1) {
			return "camino 2";
		} else if (sum3 < sum1 && sum3 < sum2) {
			return "camino 3";
		} else {
			if (sum1 == sum2 && sum2 == sum3) {
				return "camino 1, 2 y 3";
			} else if (sum1 == sum3) {
				return "caminos 1 y 3";
			} else if (sum2 == sum3) {
				return "caminos 2 y 3";
			} else {
				return "caminos 1 y 2";
			}
		}

	}

	public static void main(String[] args) {
		Bicicleta bici = new Bicicleta();
		int[] camino1 = { 12, 34, 21, 46, 25 };
		int[] camino2 = { 24, 1, 5, 64, 10, 15, 21 };
		int[] camino3 = { 1, 5, 6, 7, 8, 10, 20, 46, 104 };
		System.out.println("El camino mÃ¡s corto es:" + Bicicleta.rutaCorta(camino1, camino2, camino3) + ".");
	}
}
