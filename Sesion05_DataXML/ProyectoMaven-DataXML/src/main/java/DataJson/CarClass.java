package DataJson;

import com.google.gson.annotations.SerializedName;

public class CarClass {
	@SerializedName("codigo")
	private int idCar;
	
	@SerializedName("marca")
	private String brand;
	
	@SerializedName("modelo")
	private String model;
	
	private String color;
	
	@SerializedName("placa")
	private String carPlate;
	
	@SerializedName("tarjetaPropiedad")
	private String ownerCard;
	
	@SerializedName("añoFabricacion")
	private String year;
	
	public CarClass() {
	}

	public CarClass(int idCar, String brand, String model, String color, String carPlate, String ownerCard,
			String year) {
		this.idCar = idCar;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.carPlate = carPlate;
		this.ownerCard = ownerCard;
		this.year = year;
	}

	public int getIdCar() {
		return idCar;
	}

	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCarPlate() {
		return carPlate;
	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}

	public String getOwnerCard() {
		return ownerCard;
	}

	public void setOwnerCard(String ownerCard) {
		this.ownerCard = ownerCard;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "CarClass [idCar=" + idCar + ", brand=" + brand + ", model=" + model + ", color=" + color + ", carPlate="
				+ carPlate + ", ownerCard=" + ownerCard + ", year=" + year + "]";
	}
}
