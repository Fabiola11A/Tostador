package Consumidor;
import proveedor.Proveedor;
public class tostador {
	private final Proveedor proveedor;
	
	public tostador(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	public void imprimirProveedor() {
		proveedor.imprimir();
	}
}
