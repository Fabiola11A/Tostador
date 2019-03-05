package Consumidor.main;


import Consumidor.CustomerAndServices;
import Consumidor.tostador;
import proveedor.Proveedor;
import proveedor.ProveedorIcelmpl;
import proveedor.ProveedorMovistar;
import static proveedor.ServiceType.Electricidad;
import static proveedor.ServiceType.Telefonia;
import static proveedor.ServiceType.Otras;



public class Test {
	public static void main(String args[]) {
		
		/*tostador Tostador = new tostador(new ProveedorIcelmpl());
		Tostador.imprimirProveedor();
		
		Tostador = new tostador(new ProveedorMovistar());
		Tostador.imprimirProveedor();*/
		
		ProveedorMovistar movistar = new ProveedorMovistar();
		movistar.addCustomer("Jorge", 100d);
		movistar.addCustomer("Xinia", 200d);
		movistar.addServices(Electricidad);
		movistar.addServices(Telefonia);
		imprimirServicios(movistar);
	}
	
	private static void imprimirServicios(Proveedor provedor) {
		CustomerAndServices cs = new CustomerAndServices(provedor);
		cs.imprimirClientes();
		cs.imprimirServices();
	}
}
