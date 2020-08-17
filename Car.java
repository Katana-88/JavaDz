
public abstract class Car {
	protected String id;
	protected String carModel;
	protected int yearOfManufacture;
	protected String color;
	protected double cost;
	protected int regNumber;
	
	public Car(String id, String carModel, int yearOfManufacture, String color, double cost, int regNumber){
		this.id=id;
		this.carModel=carModel;
		this.yearOfManufacture = yearOfManufacture;
		this.color = color;
		this.cost = cost;
		this.regNumber = regNumber;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + ". " +carModel+" of "+yearOfManufacture+" year of manufacture, "+color+" color, "+
	"cost: "+cost+"$"+" with registration number "+regNumber+".\n";
	}
	

}
