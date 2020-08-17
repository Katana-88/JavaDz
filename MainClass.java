
public class MainClass {

	public static void main(String[] args) {
		int arraySize = 4;
		MercedesCarFactory mf = new MercedesCarFactory(arraySize);
		ToyotaCarFactory tf = new ToyotaCarFactory(arraySize);
		Car[] cars = new Car[arraySize];
		cars[0]=mf.getCar("600", 2019, "white", 20487.30, 12345);
		cars[1]=mf.getCar("Benz", 2008, "black", 10488.95, 6789);
		cars[2]=tf.getCar("Rav4", 2018, "silver", 3516.46, 11123);
		cars[3]=tf.getCar("Prado", 2020, "blue", 90758.81, 98654);
		
		System.out.println("All cars: ");
		for(Car car: cars) {
			System.out.print(car);
		}
		
		System.out.println("\nMercedese cars: ");

		for(MercedesCar car: mf.allCars) {
			System.out.print(car);
		}
	}

}
