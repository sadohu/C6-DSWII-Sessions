package DataJson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ProductSerializationJsonTest {

	public static void main(String[] args) throws Exception {
		serealizeProduct();
		System.out.println(" ");
		desearilizeProduct();
	}
	
	private static void serealizeProduct() throws FileNotFoundException{
		ProductClass product = new ProductClass();
		product.setIdProduct(100);
		product.setName("Naranjas");
		product.setDescription("Vitamina C");
		product.setCant(100);
		product.setLotNumber(7890);
		product.setBarsCode(00001111);
		
		// Frist method
		Gson gson = new Gson();
		String dataJson = gson.toJson(product);
		System.out.println("Frist method Serealization: \n" + dataJson);
		
		// Second method
		Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
		String dataJsonBuilder = gsonBuilder.toJson(product);
		System.out.println("Second method Serealization: \n" + dataJsonBuilder);
		
		// Save json in a File
		File jsonFile = new File ("src/files/product.json");
		PrintWriter writer = new PrintWriter(jsonFile);
		writer.write(dataJsonBuilder);
		writer.close();
	}
	
	private static void desearilizeProduct() throws IOException{
		String fileRoute = "src/files/product.json";
		Reader reader = Files.newBufferedReader(Paths.get(fileRoute));
		
		Gson gson = new Gson();
		Map<?, ?> product = gson.fromJson(reader, Map.class);
		System.out.println(product);
		System.out.println("idProduct: " + product.get("codigo") 
				+ ", name: " + product.get("Articulo")
				+ ", description: " + product.get("Descripcion del articulo")
				+ ", cant: " + product.get("Stock")
				+ ", lotNumber: " + product.get("Lote de fabricacion")
				+ ", barsCode: " + product.get("Codigo de barras"));
	}

}
