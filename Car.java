import java.util.Scanner;

public class Car {
	
	private int id;
	private String carBrand;
	private String carModel;
	private int yearOfManufacture;
	private String color;
	private double cost;
	private long regNumber;
	
	public Car() {
		id=0;
		carBrand="Default Brand";
		carModel="Default Model";
		yearOfManufacture = 1998;
		color = "black";
		cost = 100;
		regNumber = 111222333L;
	}
	
	public Car(int id, String carBrand, String carModel, int yearOfManufacture, String color, double cost, long regNumber){
		this.id=id;
		this.carBrand=carBrand;
		this.carModel=carModel;
		this.yearOfManufacture = yearOfManufacture;
		this.color = color;
		this.cost = cost;
		this.regNumber = regNumber;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getCarBrand() {
		return carBrand;
	}
	
	public void setcCarBrand(String carBrand) {
		this.carBrand=carBrand;
	}
	
	public String getCarModel() {
		return carModel;
	}
	
	public void setCarModel(String carModel) {
		this.carModel=carModel;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture=yearOfManufacture;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost=cost;
	}
	public long getRegNumber() {
		return regNumber;
	}
	
	public void setRegNumber(int regNumber) {
		this.regNumber=regNumber;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + ". " + carBrand+" "+carModel+" of "+yearOfManufacture+" year of manufacture, "+color+" color, "+
	"cost: "+cost+"$"+" with registration number "+regNumber+".\n";
	}
	

	public static void main(String[] args) {
		Car [] array = new Car[8];
		array[0] = new Car(1, "Audi", "A8", 2017, "silver", 81296.30, 158795482);
		array[1] = new Car(2, "Audi", "RS7", 2019, "red", 124828.93, 999554852);
		array[2] = new Car(3, "BMW", "Z4", 2020, "navy", 150400.60, 777888521);
		array[3] = new Car(4, "BMW", "X5", 2020, "red", 97610.67, 1114587622);
		array[4] = new Car(5, "KIA", "Stonic", 2008, "silver", 19850.08, 258147369);
		array[5] = new Car(6, "Volkswagen", "Golf", 2009, "black", 21607.55, 784512368);
		array[6] = new Car(7, "KIA", "Sorento", 2019, "blue", 40860.56, 951753824);
		array[7] = new Car(8, "Volkswagen", "Tiguan", 2017, "white", 32676.15, 456789321);
		
		//a) list of some car brand.
		System.out.println("There are 4 car brands in list: Audi, BMW, KIA and Volkswagen. \r\n" + 
				"Type brand to view the available autos: ");
		
		Scanner scan = new Scanner(System.in);
		String brandToView = scan.nextLine();
		int count=0;
		for(Car car: array) {
				if(car.getCarBrand().equals(brandToView)) {
					System.out.println(car.toString());
					count++;
				}
				}
		if(count==0) System.out.println("The brand you specified is not in the list.");
		
		//b) list of some car model, the age of which is higher than the specified one.
		System.out.println("Car models in list: A8, RS7, Z4, X5, Stonic, Golf, Sorento and Tiguan. \r\n" + 
				"Type model:");
		String modelToView = scan.nextLine();
		System.out.println("Type min age for it model:");
		int age = Integer.parseInt(scan.nextLine());
		count=0;
		int currentYear=2020;
		for(Car car: array) {
				if(car.getCarModel().equals(modelToView)&&car.getYearOfManufacture()+age<currentYear) {
					System.out.println(car.toString());
					count++;
				}
				}
		if(count==0) System.out.println("The model or age you specified are not in the list.");
		


		//c) a list of cars of a given year of manufacture, the price of which is higher than the specified one.
		System.out.println("Type year of manufacture:");
		int year = Integer.parseInt(scan.nextLine());
		System.out.println("Type min cost:");
		long price = Long.parseLong(scan.nextLine());
		count=0;
		for(Car car: array) {
				if(car.getYearOfManufacture()==year&&car.getCost()>price) {
					System.out.println(car.toString());
					count++;
				}
				}
		if(count==0) System.out.println("There are no cars with such characteristics.");
	}
}
