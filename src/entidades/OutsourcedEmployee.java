package entidades;

public class OutsourcedEmployee extends Employee {

	private double additionalCharge;

	public OutsourcedEmployee(double additionalCharge) {
		super();
		this.additionalCharge = additionalCharge;
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return (getValuePerHour() * getHours()) + (additionalCharge*1.10);
	}
}
