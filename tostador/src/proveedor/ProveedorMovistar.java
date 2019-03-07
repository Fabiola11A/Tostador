package proveedor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import proveedor.ServiceType;

public class ProveedorMovistar implements Proveedor{
	
	private static final String PROVEDOR = "Soy el proveedor MOVISTAR";
    private static final List<ServiceType> serviceList = new ArrayList<ServiceType>();
    private static final Map<String, Double> customers = new HashMap<String, Double>();

	@Override
	public void imprimir() {
		System.out.println(PROVEDOR);
		
	}

	@Override
	public List<ServiceType> getServices() {
		// TODO Auto-generated method stub
		return serviceList;
	}

	@Override
	public void addServices(ServiceType serviceTypes) {
		serviceList.add(serviceTypes);
		
	}

	@Override
	public Map<String, Double> getCustomer() {
		// TODO Auto-generated method stub
		return customers;
	}

	@Override
	public void addCustomer(String name, Double amount) {
		// TODO Auto-generated method stub
		customers.put(name,amount);
	}

}
