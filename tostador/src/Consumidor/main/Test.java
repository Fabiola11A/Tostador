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
		movistar.imprimir();
		movistar.addCustomer("Jorge", 100d);
		movistar.addCustomer("Xinia", 200d);
		movistar.addServices(Electricidad);
		movistar.addServices(Telefonia);
		movistar.addServices(Otras);
		imprimirServicios(movistar);
		
		ProveedorIcelmpl ice= new ProveedorIcelmpl();
		ice.imprimir();
		ice.addCustomer("Maria", 100d);
		ice.addCustomer("Pedro",200d);
		ice.addServices(Electricidad);
		ice.addServices(Telefonia);
		ice.addServices(Otras);
		imprimirServicios(ice);
	}
	
	private static void imprimirServicios(Proveedor provedor) {
		CustomerAndServices cs = new CustomerAndServices(provedor);
		cs.imprimirClientes();
		cs.imprimirServices();
	}
}
