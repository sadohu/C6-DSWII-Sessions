package DataXML;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ClassClientType {
	private int idtipocliente;
	private String nombre;
	//declaramos una variable de tipo cliente
	private List<ClassClient> clientes;
	
	
	public ClassClientType(){
		
	}   //fin del constructor...
	
	public int getIdtipocliente() {
		return idtipocliente;
	}
	
	@XmlElement(name="cliente")
	public void setIdtipocliente(int idtipocliente) {
		this.idtipocliente = idtipocliente;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<ClassClient> getCliente() {
		return clientes;
	}
	
	public void setCliente(List<ClassClient> clientes) {
		this.clientes = clientes;
	}
}
