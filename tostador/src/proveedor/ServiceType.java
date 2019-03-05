package proveedor;

public enum ServiceType {
	Electricidad("Electricidad",100),
	Telefonia("Telefono",200),
	Otras("Internet",300);
	
	private final String name;
	private final double totalAmount;
	
	private ServiceType(String name,double totalAmount) {
		this.name=name;
		this.totalAmount=totalAmount;
	}
	public String getName() {
		return name;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
}
