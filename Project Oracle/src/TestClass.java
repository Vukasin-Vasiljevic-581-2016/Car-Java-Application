import java.io.IOException;
import java.util.*;
import java.util.regex.*;

public class TestClass {
	
	
	public static void main(String[] arg) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		List<CarClass> cars = new ArrayList<CarClass>();
		cars.add(new CarClass("Opel", "Insignia", 2016, 13000, 110));
		cars.add(new CarClass("Kia", "Sportage", 2006, 4000, 100));
		cars.add(new CarClass("Hyundai", "Santa Fe", 2008, 7500, 120));
		cars.add(new CarClass("Audi", "A4", 2003, 4500, 140));
		cars.add(new CarClass("Citroen", "C4 Grand Picasso", 2009, 5490, 110));
		cars.add(new CarClass("Toyota", "Avensis", 2002, 1750, 110));
		cars.add(new CarClass("Alfa Romeo", "147", 2005, 2700, 120));
		cars.add(new CarClass("Peugeot", "3008", 2003, 7790, 112));
		cars.add(new CarClass("Fiat", "Punto", 2001, 1550, 91));
		cars.add(new CarClass("Opel", " Corsa", 2012, 5850, 95));
		cars.add(new CarClass("Citroen", "C4 Grand Picasso", 2008, 4990, 136));
		cars.add(new CarClass("Fiat", " Stilo", 2003, 1950, 116));
		cars.add(new CarClass("Mazda", "6", 2003, 2850, 110));
		cars.add(new CarClass("Citroen", "C4", 2007, 3990, 110));
		cars.add(new CarClass("Opel", "Astra H", 2006, 3699, 120));
		cars.add(new CarClass("Renault", "Kadjar", 2016, 16666, 110));
		cars.add(new CarClass("Ford", "Fiesta", 2009, 4999, 110));
		cars.add(new CarClass("Fiat", "Grande Punto", 2006, 3649, 120));
		cars.add(new CarClass("Opel", "Corsa", 2003, 1899, 95));
		cars.add(new CarClass("Volkswagen", "Passat B7", 2014, 11490, 140));
		cars.add(new CarClass("Opel", "Insignia", 2015, 10200, 131));
		cars.add(new CarClass("Renault", "Kangoo MAXI", 2013, 7200, 90));
		cars.add(new CarClass("Opel", "Corsa D", 2006, 3650, 90));
		cars.add(new CarClass("Toyota", "Corolla Verso", 2005, 4150, 116));
		cars.add(new CarClass("Volkswagen", "Golf 4", 2002, 2950, 101));
		cars.add(new CarClass("Citroen", "C5", 2009, 7090, 136));
		cars.add(new CarClass("Opel", "Meriva", 2005, 2590, 69));
		cars.add(new CarClass("Fiat", "Doblo", 2008, 3590, 103));
		cars.add(new CarClass("Peugeot", "207", 2010, 4550, 90));
		cars.add(new CarClass("Mercedes Benz", "c220", 2008, 10450, 170));
		cars.add(new CarClass("Volkswagen", "Golf 6", 2009, 7150, 109));
		cars.add(new CarClass("Peugeot", "3008", 2010, 7990, 109));
		cars.add(new CarClass("Lancia", "Ypsilon", 2002, 1500, 95));
		cars.add(new CarClass("Fiat", "Stilo", 2004, 2099, 116));
		cars.add(new CarClass("Opel", "Corsa", 2005, 2299, 101));
		cars.add(new CarClass("Opel", "Meriva", 2006, 2699, 75));
		cars.add(new CarClass("BMW", "525", 2007, 10499, 177));
		cars.add(new CarClass("Mercedes Benz", "E200", 2013, 21950, 136));
		cars.add(new CarClass("Mercedes Benz", "A180", 2013, 13950, 109));
		cars.add(new CarClass("Mercedes Benz", "B180", 2014, 12750, 109));
		cars.add(new CarClass("Audi", "A4", 2002, 4250, 131));
		cars.add(new CarClass("Peugeot", "308", 2011, 5600, 92));
		cars.add(new CarClass("Volkswagen", "Golf 5", 2008, 6100, 140));
		cars.add(new CarClass("Nissan", "Qashqai", 2014, 16950, 131));
		cars.add(new CarClass("Honda", "Civic", 2008, 5890, 83));
		cars.add(new CarClass("Volvo", "XC60", 2015, 19950, 181));
		cars.add(new CarClass("Citroen", "C3", 2007, 3250, 75));
		cars.add(new CarClass("Renault", "Megane RS", 2010, 13850, 250));
		cars.add(new CarClass("Audi", "Q7", 2008, 15200, 239));
		cars.add(new CarClass("Seat", "Ibiza", 2004, 2100, 64));
		cars.add(new CarClass("BMW", "X5", 2008, 16490, 234));
		cars.add(new CarClass("Skoda", "Octavia", 2011, 8999, 105));
		cars.add(new CarClass("BMW", "320", 2008, 6400, 177));
		cars.add(new CarClass("Audi", "A4", 2005, 5400, 116));
		cars.add(new CarClass("Volvo", "XC600", 2014, 19300, 140));
		cars.add(new CarClass("Volvo", "S40", 2005, 4750, 140));
		cars.add(new CarClass("Volvo", "V50", 2002, 2950, 101));
		cars.add(new CarClass("Volvo", "C5", 2009, 7090, 136));
		cars.add(new CarClass("Volvo", "S60", 2013, 10800, 114));
		cars.add(new CarClass("Volvo", "XC70", 2008, 7000, 184));
		cars.add(new CarClass("Audi", "A6", 2015, 29900, 180));
		cars.add(new CarClass("Audi", "A3", 2015, 13250, 110));
		cars.add(new CarClass("Audi", "A4", 2005, 6000, 131));
		cars.add(new CarClass("Renault", "Laguna", 2004, 1800, 109));
		cars.add(new CarClass("Volkswagen", "Golf 3", 1992, 850, 100));
		cars.add(new CarClass("Peugeot", "406", 1999, 1350, 90));
		cars.add(new CarClass("Renault", "Megane", 1997, 550, 147));
		cars.add(new CarClass("Audi", "A3", 1999, 1800, 110));
		cars.add(new CarClass("Volkswagen", "Caddy", 1998, 499, 64));
		cars.add(new CarClass("Audi", "100 C4", 1993, 1380, 150));
		cars.add(new CarClass("Alfa Romeo", "146", 1998, 799, 109));
		cars.add(new CarClass("Volkswagen", "Golf 3", 1992, 850, 90));
		cars.add(new CarClass("BMW", "316", 1990, 1600, 102));
		cars.add(new CarClass("Mazda", "121 DB", 1991, 1250, 110));
		cars.add(new CarClass("Opel", "Frontera", 1998, 1000, 116));
		
		int num=1;
		while(num!=0) {
	    //Interface menu
	    System.out.println("If you want to sort the list of cars enter 1\n");
		System.out.println("If you want to search for a specific car enter 2\n");
		System.out.println("If you want add new car enter 3\n");
		System.out.println("\n\nIf you want to exit the program enter 0");
		try {
			num = input.nextInt();
		}
		catch(Exception e){
			System.out.println("Please choose listed option, try again!");
			num = 1;	
		}
		//num = input.nextInt();
		List<CarClass> copyList = new ArrayList<CarClass>();
			switch(num) {
			case 0:
				num = 0;
				break;
			case 1:
				System.out.println("Enter the type of sorting: ");
				System.out.println("\nA - alphabetically" + "\nB - by car age" + "\nC - by car price" + 
						"\nD - by car power");
				String sort = input.next();
				switch(sort.toLowerCase()) {
				case "a":
					 Collections.sort(cars, new Comparator<CarClass>() {
					      @Override
					      public int compare(final CarClass object1, final CarClass object2) {
					          return object1.getCar_brand().compareTo(object2.getCar_brand());
					      }
					 });
					 print(cars);
					 break;
				case "b":
					System.out.println("\n-------------------------------------------------------------------------------");
					System.out.println("\nN - Newest" + "\nO - Oldest" + "\nF - From--To");
					String c = input.next();
					switch(c.toLowerCase()) {
					case "n":
						copyList = cars;
						Collections.sort(copyList, new Comparator<CarClass>() {
						    @Override
						    public int compare(CarClass z1, CarClass z2) {
						        if (z1.getCar_age() > z2.getCar_age())
						            return 1;
						        if (z1.getCar_age() < z2.getCar_age())
						            return -1;
						        return 0;
						    }
						});
						Collections.reverse(copyList);
						print(copyList);
						break;
					case "o":
					copyList = cars;
					Collections.sort(copyList, new Comparator<CarClass>() {
					    @Override
					    public int compare(CarClass z1, CarClass z2) {
					        if (z1.getCar_age() > z2.getCar_age())
					            return 1;
					        if (z1.getCar_age() < z2.getCar_age())
					            return -1;
					        return 0;
					    }
					});
					print(copyList); 
					break;
					case "f":
						System.out.println("From year: ");
						
						int yearF = input.nextInt();
						while(yearF<1990||yearF>2019) {
							System.out.println("There is no car age under 1990, enter again: ");
							yearF = input.nextInt();
						}
						System.out.println("To year: ");
						int yearT = input.nextInt();
						while(yearF>yearT||yearT>2019) {
							System.out.println("There is no car age above 2019, enter again: ");
							yearT = input.nextInt();
						}
						for(CarClass e : cars) {
							if(e.getCar_age()>=yearF && e.getCar_age()<=yearT)
								copyList.add(e);
						}
						print(copyList);
						break;
						}
					break;
				case "c":
					System.out.println("L - Lower than\nP - Price increasing\n");
					String str = input.next();
					switch(str.toLowerCase()) {
					case "l":
						System.out.println("Enter price:");
						int price = input.nextInt();
						
						for(CarClass e : cars) {
							if(e.getCar_price()<price)
								copyList.add(e);
						}
						print(copyList);
						break;
					case "p":
						copyList = cars;
						Collections.sort(copyList, new Comparator<CarClass>() {
						    @Override
						    public int compare(CarClass z1, CarClass z2) {
						        if (z1.getCar_price() > z2.getCar_price())
						            return 1;
						        if (z1.getCar_price() < z2.getCar_price())
						            return -1;
						        return 0;
						    }
						});
						print(copyList);
						break;
					}
					break;
					
				case "d":
					copyList = cars;
					Collections.sort(copyList, new Comparator<CarClass>() {
					    @Override
					    public int compare(CarClass z1, CarClass z2) {
					        if (z1.getCar_power() > z2.getCar_power())
					            return 1;
					        if (z1.getCar_power() < z2.getCar_power())
					            return -1;
					        return 0;
					    }
					});
					print(copyList);
					break;
					
				} 	
				break;
			case 2:
				System.out.println("A - Search for specific brand only\nB - Search for specific brand and model");
				String in = input.next();
				switch(in.toLowerCase()) {
				case "a":
					System.out.println("\nSearch for car brand: ");
					boolean t = true;
					while(t) {
						String carBrand = input.nextLine();
						if(carBrand.isEmpty()) t = true;
						else {
							t = false;
							for(CarClass e : cars) {
								if(e.getCar_brand().toLowerCase().contains(carBrand.toLowerCase()))
									copyList.add(e);
							}
							print(copyList);
						}
					}
					break;
				case "b":
					System.out.println("\nSearch for car brand: ");
					boolean p = true;
					while(p) {
						String carBrand = input.nextLine();
						//System.out.println("\nModel: ");
						//String carModel= input.nextLine();
						if(carBrand.isEmpty()) p = true;
						else {
							System.out.println("\nModel: ");
							String carModel= input.nextLine();
							boolean o = true;
							if(carBrand.isEmpty()) o = true;
							else {
								for(CarClass e : cars) {
									if(e.getCar_brand().toLowerCase().contains(carBrand.toLowerCase())&&e.getCar_model().toLowerCase().contains(carModel.toLowerCase()))
										copyList.add(e);
								}
							}
							p = false;
							print(copyList);
						}						
					}
					break;
				}	
			break;
			case 3:
				try {
					cars.add(new CarClass());
					print(cars);
				}
				catch (Exception e) {
					System.out.println("You entered invalid type somewhere, enter parameters again!");
					cars.add(new CarClass());
				}
				print(cars);
				break;
			default:
				System.out.print("Error! You choosed wrong option! Please try again!" );
				break;
			}
		}
			
	}
	public static void print(List<CarClass> list) {
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("------------------------------------SEARCH RESULTS---------------------------------------------");
	    System.out.printf("%15s %25s %15s %20s %15s", "BRAND", "MODEL", "YEAR", "PRICE(e)", "POWER(hp)");
	    System.out.println();
	    System.out.println("----------------------------------------------------------------------------------------------");
	    for(CarClass car : list){
	        System.out.format("%15s %25s %15d %20d %15d",
	                 car.getCar_brand(), car.getCar_model(), car.getCar_age(), car.getCar_price(), car.getCar_power());
	        System.out.println();
	    }
	    System.out.println("----------------------------------------------------------------------------------------------");



	}


}
