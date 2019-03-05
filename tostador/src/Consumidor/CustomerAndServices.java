package Consumidor;

import proveedor.Proveedor;
import proveedor.ServiceType;

public class CustomerAndServices {
	// immutable object
		private final Proveedor provedor;

		// inyeccion de dependencia
		public  CustomerAndServices(Proveedor provedor) {
			this.provedor = provedor; // estamos haciendo composicion.
		}

		public void imprimirProvedor() {
			provedor.imprimir();
			
			
		}

		public void imprimirClientes() {
			for (String name : provedor.getCustomer().keySet()) {
				System.out.print("cliente: " + name + ", ");
				System.out.println("monto adeudado:" + provedor.getCustomer().get(name));
			}
		}

		public void imprimirServices() {
			for (ServiceType type : provedor.getServices()) {
				System.out.print("servicio: " + type.getName() + ", ");
				System.out.println("monto total: " + type.getName());
			}

		}

}
