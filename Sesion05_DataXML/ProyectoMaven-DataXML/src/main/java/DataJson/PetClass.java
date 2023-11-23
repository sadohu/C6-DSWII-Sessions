package DataJson;

import com.google.gson.annotations.SerializedName;

public class PetClass {
	// Personalizar los parametros { SerializedName("name") }
	@SerializedName("codigo") 
	private int idPet;
	@SerializedName("nombre") 
	private String name;
	@SerializedName("raza") 
	private String race;
	@SerializedName("colorpelaje") 
	private String color;
	@SerializedName("nrovacunas") 
	private String vaccine;
	@SerializedName("edad") 
	private String age;
	@SerializedName("peso") 
	private String weight;
	
	public PetClass() {
	}

	public PetClass(int idPet, String name, String race, String color, String vaccine, String age, String weight) {
		this.idPet = idPet;
		this.name = name;
		this.race = race;
		this.color = color;
		this.vaccine = vaccine;
		this.age = age;
		this.weight = weight;
	}

	public int getIdPet() {
		return idPet;
	}

	public void setIdPet(int idPet) {
		this.idPet = idPet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVaccine() {
		return vaccine;
	}

	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	
}
