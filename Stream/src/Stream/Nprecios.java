package Stream;

import java.util.Scanner;

public class Nprecios {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		int Tamaño;
	// Lee el numero de productos  
		System.out.println("Digite la cantidad de productos");
		Tamaño  = lector.nextInt();
		// Declara los arreglos para su precio inicial y descuentos
		double [] precios = new double [Tamaño];
		double [] PreciosconDescuento = new double [Tamaño];
		String [] nombre = new String [Tamaño];
		// Lee el precio de los productos 
		for (int i = 0; i < Tamaño; i++) {
		System.out.println("Digite el nombre del producto" + i + ":");
		nombre [i] = lector.next();
		
		System.out.println("ingrese el precio del producto " + i + ":");
		precios[i] = lector.nextDouble();
		// Descuento correspondiente
		if (precios [i] > 55000) {
			PreciosconDescuento [i] = precios[i] * 0.90;
			
			
		}else {
		PreciosconDescuento [i] = precios [i] * 0.95;
		}
		}
		//precios originales y precios con descuento
	    for (int i = 0; i <Tamaño; i++ ) {
	    	System.out.println("El producto" + nombre [i] +"con el descuento queda en " + PreciosconDescuento[i]);
	    	
	    	
}
}
}