package proveedor;

import java.util.List;
import java.util.Map;

public class ProveedorIcelmpl implements Proveedor {
    //immutable object 
	private static final String PROVEDOR = "Soy el provedor ICE";

	@Override
	public void imprimir() {
		System.out.println(PROVEDOR);
	}

	@Override
	public List<ServiceType> getServices() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void addServices(ServiceType serviceTypes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Double> getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCustomer(String name, Double amount) {
		// TODO Auto-generated method stub
		
	}
}
