package Consumidor.main;

import Consumidor.tostador;
import proveedor.ProveedorICElmpm;
import proveedor.ProveedorMovistar;

public class Test {
	public static void main(String args[]) {
		
		tostador Tostador = new tostador(new ProveedorICElmpm());
		Tostador.imprimirProveedor();
		
		Tostador = new tostador(new ProveedorMovistar());
		Tostador.imprimirProveedor();
	}
}
