package DataXML;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ClassTestJAXB {

	public static void main(String[] args) {
		//instanciamos las respectivas clases..
		List<ClassClient> list = new ArrayList<ClassClient>();
		ClassClient cliente=new ClassClient();
		
		//agregamos cliente
		cliente.setIdcliente(100);
		cliente.setNombre("rosa maria");
		cliente.setApellido("perez gomez");
		cliente.setDni("145678");
		cliente.setSexo("f");
		cliente.setTelefono("3814950");
		
		//agregamos al listado
		list.add(cliente);
		ClassClient clientedos=new ClassClient();
		clientedos.setIdcliente(200);
		clientedos.setNombre("nilson alexander");
		clientedos.setApellido("ramirez");
		clientedos.setDni("145789");
		clientedos.setSexo("m");
		clientedos.setTelefono("7896478");
		
		//agregamos al listado
		list.add(clientedos);
		ClassClient clientetres=new ClassClient();
		clientetres.setIdcliente(300);
		clientetres.setNombre("jorge luis");
		clientetres.setApellido("tasayco");
		clientetres.setDni("789466");
		clientetres.setSexo("m");
		clientetres.setTelefono("387459");
		
		//agregamos al listado
		list.add(clientetres);
		//instanciamos la clase classtipocliente...
		ClassClientType cltip=new ClassClientType();
		//asignamos el listado
		cltip.setCliente(list);
		
		//aplicamos JAXB
		try {
			JAXBContext con=JAXBContext.newInstance(ClassClientType.class);
			//aplicamos la clase marshaler
			
			//vinculamos  marshaller con jaxbcont...
			Marshaller mar=con.createMarshaller();
			//prepara formato para el archivo  xml...
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			//aplicamos la clase file..
			File archivoxml = new File("E:/archivoxml/cliente.xml");
			mar.marshal(cltip,archivoxml);
            //emitimos mensaje por consola
				System.out.println("archivo convertido");
		} catch (JAXBException e) {
			e.printStackTrace();
		}   //fin del catch...

	}

}
