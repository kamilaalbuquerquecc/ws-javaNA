package entities;

public class OutsoursedEmployee extends Employee  {

	private Double additionalCharge;
	public OutsoursedEmployee () {
		
	}
	
	public OutsoursedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
