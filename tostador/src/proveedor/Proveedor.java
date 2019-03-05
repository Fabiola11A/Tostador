package proveedor;

import java.util.List;
import java.util.Map;


public interface Proveedor {
	void imprimir();
	
	 List<ServiceType> getServices();
	  void addServices(ServiceType serviceTypes);
	  
	  Map<String, Double> getCustomer();
	  void addCustomer(String name, Double amount);
}
