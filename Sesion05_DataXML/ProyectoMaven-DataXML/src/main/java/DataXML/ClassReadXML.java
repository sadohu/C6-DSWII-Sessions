package DataXML;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ClassReadXML {
	
	// Método para leer archivos xml
	public void readXml(){
		try {
			// Cerar un reader mediante el contexto JAXB
			JAXBContext reader = JAXBContext.newInstance(ClassClientType.class);
			Unmarshaller unmarshaller = reader.createUnmarshaller();
			
			// Buscamos el archivo con File
			File xmlFile = new File("E:/archivoxml/cliente.xml");
			
			// Parsear el archivo Xml al objeto ClientType
			ClassClientType clientType =(ClassClientType)unmarshaller.unmarshal(xmlFile);
			
			// Bucle para visualizar la información
			for (ClassClient item : clientType.getCliente()) {
				System.out.println(item);
			}
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
