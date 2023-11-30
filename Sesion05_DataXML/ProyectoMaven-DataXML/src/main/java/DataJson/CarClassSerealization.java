package DataJson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CarClassSerealization {

	public static void main(String[] args) throws Exception {
		System.out.println("Serealize");
		serealizeCars();
		System.out.println("\nDeserealize");
		desearilizeCars();

	}
	
	private static void serealizeCars() throws FileNotFoundException{
		CarClass car = new CarClass();
		car.setIdCar(10);
		car.setBrand("Nissan");
		car.setModel("Versa");
		car.setColor("Black");
		car.setCarPlate("UFT-100");
		car.setOwnerCard("TF2023-1058");
		car.setYear("2023");
		
		CarClass car2 = new CarClass();
		car2.setIdCar(20);
		car2.setBrand("Toyota");
		car2.setModel("Rush");
		car2.setColor("Black");
		car2.setCarPlate("UFT-178");
		car2.setOwnerCard("TF2021-1778");
		car2.setYear("2021");
		
		CarClass car3 = new CarClass();
		car3.setIdCar(30);
		car3.setBrand("Glory");
		car3.setModel("550");
		car3.setColor("White");
		car3.setCarPlate("UKG-199");
		car3.setOwnerCard("TF2023-1188");
		car3.setYear("2023");
		
		List<CarClass> cars = new ArrayList<CarClass>();
		cars.add(car);
		cars.add(car2);
		cars.add(car3);
		
		// Frist method
		Gson gson = new Gson();
		String dataJson = gson.toJson(cars);
		System.out.println("Frist method Serealization: \n" + dataJson);
		
		// Second method
		Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
		String dataJsonBuilder = gsonBuilder.toJson(cars);
		System.out.println("Second method Serealization: \n" + dataJsonBuilder);
		
		// Save json in a File
		File jsonFile = new File ("src/files/cars.json");
		PrintWriter writer = new PrintWriter(jsonFile);
		writer.write(dataJsonBuilder);
		writer.close();
	}
	
	private static void desearilizeCars() throws IOException{
		String fileRoute = "src/files/cars.json";
		Reader reader = Files.newBufferedReader(Paths.get(fileRoute));
		
		Gson gson = new Gson();
		CarClass[] cars = gson.fromJson(reader, CarClass[].class);
		System.out.println(cars);
		for (CarClass car : cars) {
			System.out.println("idCar: " + car.getIdCar()
			+ ", brand: " + car.getBrand()
			+ ", model: " + car.getModel()
			+ ", color: " + car.getColor()
			+ ", carPlate: " + car.getCarPlate()
			+ ", ownerCard: " + car.getOwnerCard()
			+ ", year: " + car.getYear());
		}
	}

}
