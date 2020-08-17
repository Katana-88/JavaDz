
public class ToyotaCarFactory extends CarFactory<ToyotaCar>{
	
	public ToyotaCarFactory(int arraySize) {
		super(arraySize);
	}

	public ToyotaCar getCar(String carModel, int yearOfManufacture, String color, double cost, int regNumber) {
		Integer hash = 17;
		hash = 31 * hash + regNumber;
		hash = 31 * hash + carModel.hashCode();
		String id = hash.toString();
		ToyotaCar newCar = new ToyotaCar(id, carModel, yearOfManufacture, color, cost, regNumber);
		addCar(newCar);
		return newCar;
	};
	
	public ToyotaCar addCar(ToyotaCar car) {
		if(allCars.size() < arrSize) {
			allCars.add(car);
			return car;
		}
		return null;
	}

}
