import java.util.*;
import java.io.IOException;
import java.lang.*;

public class CarClass {
	//car characteristics
	private String car_brand;
	private String car_model;
	private int car_age;
	private int car_price;
	private int car_power;
	
	//Scanner
	Scanner input = new Scanner(System.in);
	
	//getters and setters
	public String getCar_brand() {
		return car_brand;
	}
	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}
	public String getCar_model() {
		return car_model;
	}
	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}
	public int getCar_age() {
		return car_age;
	}
	public void setCar_age(int car_age) {
		this.car_age = car_age;
	}
	public int getCar_price() {
		return car_price;
	}
	public void setCar_price(int car_price) {
		this.car_price = car_price;
	}
	public int getCar_power() {
		return car_power;
	}
	public void setCar_power(int car_power) {
		this.car_power = car_power;
	}

	//constructor that import car with parameters 
	public CarClass(){
		System.out.println("Enter car brand: ");
		String brand = input.nextLine();
		System.out.println("Enter car model: ");
		String model = input.nextLine();
		System.out.println("Enter car age: ");
		int age;
		
		do {
			age = input.nextInt();
			if(Integer.toString(age).length()!=4 || age<1980 || age>=2019) {
				System.out.println("Enter age again: ");
			}
		}while(Integer.toString(age).length()!=4 || age<1980 || age>=2019);
		/////
		int price;
		System.out.println("Enter car price: ");
		do {
			price = input.nextInt();
			if(price>500000 || price<=0 ) {
				System.out.println("Enter price again: ");
			}
		}while(price>500000 || price<=0);
		/////
		System.out.println("Enter car power(hp): ");
		int power;
		do {
			power = input.nextInt();
			if(power<30 || power > 1000) {
				System.out.println("Enter car power again: ");
			}
		}while(power<30 || power > 1000);
		/////	
		car_brand = brand;
		car_model = model;
		car_age = age;
		car_price = price;
		car_power = power;
		
	}
	//constructor for importing cars manually
	public CarClass(String brand, String model, int age, int price, int power) {
		car_brand = brand;
		car_model= model;
		car_age = age;
		car_price = price;
		car_power = power;
	}
	
	
	//to String method
	public String toString() {
		return "Car brand: " + car_brand + "\t" + "Car model: " + car_model + "\t"
				+ "Car age: " + car_age + "\t" + "Car price: " + car_price + "\t" +
				"Car power: " + car_power + "\t"; 
	}
		
}

