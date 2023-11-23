package DataJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestSerializeJSONPet {

	public static void main(String[] args) {
		PetClass pet = new PetClass();
		pet.setIdPet(100);
		pet.setName("Aluze");
		pet.setRace("Felina");
		pet.setColor("Banco, Naranja, Gris");
		pet.setVaccine("5");
		pet.setAge("2 years");
		pet.setWeight("3 kg");
		
		// Primera forma de serialziacion
		Gson petGson = new Gson();
		String dataJson = petGson.toJson(pet);
		System.out.println(dataJson);
		
		// Segunda forma de serializacion
		Gson petGsonBuilder = new GsonBuilder().setPrettyPrinting().create();
		String dataJsonBuilder = petGsonBuilder.toJson(pet);
		System.out.println(dataJsonBuilder);

	}

}
