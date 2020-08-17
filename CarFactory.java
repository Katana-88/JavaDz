import java.util.ArrayList;

public abstract class CarFactory <T extends Car> {
	public ArrayList<T> allCars;
	public int arrSize;

	public CarFactory(int arraySize) {
		this.arrSize = arraySize;
		this.allCars = new ArrayList<T>(arraySize);
	}
	
	public abstract T getCar(String carModel, int yearOfManufacture, String color, double cost, int regNumber);

}
