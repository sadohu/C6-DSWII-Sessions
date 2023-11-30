package DataJson;

import com.google.gson.annotations.SerializedName;

public class ProductClass {
	@SerializedName("codigo")
	private int idProduct;
	
	@SerializedName("Articulo")
	private String name;
	
	@SerializedName("Descripcion del articulo")
	private String description;
	
	@SerializedName("Stock")
	private int cant;
	
	@SerializedName("Lote de fabricacion")
	private int lotNumber;
	
	@SerializedName("Codigo de barras")
	private int barsCode;
	
	public ProductClass() {
	}

	public ProductClass(int idProduct, String name, String description, int cant, int lotNumber, int barsCode) {
		this.idProduct = idProduct;
		this.name = name;
		this.description = description;
		this.cant = cant;
		this.lotNumber = lotNumber;
		this.barsCode = barsCode;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public int getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(int lotNumber) {
		this.lotNumber = lotNumber;
	}

	public int getBarsCode() {
		return barsCode;
	}

	public void setBarsCode(int barsCode) {
		this.barsCode = barsCode;
	}

	@Override
	public String toString() {
		return "ProductClass [idProduct=" + idProduct + ", name=" + name + ", description=" + description + ", cant="
				+ cant + ", lotNumber=" + lotNumber + ", barsCode=" + barsCode + "]";
	}
	
}
