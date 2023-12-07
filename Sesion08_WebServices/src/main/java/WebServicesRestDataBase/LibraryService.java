package WebServicesRestDataBase;

import java.util.List;
import java.util.Objects;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/biblioteca")
public class LibraryService {

	AutorService autorService = new AutorServiceImpl();

	@GET
	@Path("/autores")
	@Produces(MediaType.APPLICATION_JSON)
	public Response autores() {
		List<Autor> autores = autorService.listAutors();
		return Response.ok(autores).build();
	}

	@POST
	@Path("/autor")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveAutor(Autor autor) {
		autorService.addAutor(autor);
		return Response.status(Status.CREATED).build();
	}

	@GET
	@Path("/autor/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response autorById(@PathParam("id") int id) {
		Autor autor = new Autor();
		autor.setIdautor(id);

		Autor autorFinded = autorService.findAutor(autor);
		if (Objects.isNull(autorFinded))
			return Response.status(Status.BAD_REQUEST).entity("Autor no encontrado").build();

		return Response.ok(autorFinded).build();
	}

	@PUT
	@Path("/autor")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateAutor(Autor autor) {
		Autor autorFinded = autorService.findAutor(autor);

		if (Objects.isNull(autorFinded))
			return Response.status(Status.BAD_REQUEST)
					.entity("No se encuentran resultados con el ID: " + autor.getIdautor()).build();

		autorService.updateAutor(autor);
		return Response.status(Status.CREATED).build();
	}
	
	@DELETE
	@Path("/autor/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteAutor(@PathParam("id") int id){
		Autor autor = new Autor();
		autor.setIdautor(id);
		
		Autor autorFinded = autorService.findAutor(autor);
		if (Objects.isNull(autorFinded))
			return Response.status(Status.BAD_REQUEST)
					.entity("No se encuentran resultados con el ID: " + autor.getIdautor()).build();

		autorService.deleteAutor(autorFinded);
		return Response.status(Status.CREATED).build();
	}
	
	
}
