
public class MercedesCarFactory extends CarFactory<MercedesCar>{

	public MercedesCarFactory(int arraySize) {
		super(arraySize);
	}

	public MercedesCar getCar(String carModel, int yearOfManufacture, String color, double cost, int regNumber) {
		Integer hash = 17;
		hash = 31 * hash + regNumber;
		hash = 31 * hash + yearOfManufacture;
		String id = hash.toString();
		MercedesCar newCar = new MercedesCar(id, carModel, yearOfManufacture, color, cost, regNumber);
		addCar(newCar);
		return newCar;
	};
	
	public MercedesCar addCar(MercedesCar car) {
		if(allCars.size() < arrSize) {
				allCars.add(car);
				return car;
			}
			return null;
	}
}
