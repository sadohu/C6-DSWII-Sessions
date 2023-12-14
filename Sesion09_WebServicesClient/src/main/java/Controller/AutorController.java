package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Autor;
import Service.AutorService;

/**
 * Servlet implementation class AutorController
 */
public class AutorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getParameter("action");
		if(action != null){
			switch(action){
			case "create":
				request.getRequestDispatcher("/RegistrarAutor.jsp").forward(request, response);
				break;
				
			case "read":
				AutorService autorService = new AutorService();
				List<Autor> autors = autorService.autores();
				request.setAttribute("list", autors);
				request.getRequestDispatcher("/ListadoAutores.jsp").forward(request, response);
				break;
				
			case "update":
				break;
				
			case "delete":
				break;
				
			case "search":
				break;
			}
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
		String nomautor = request.getParameter("nomautor");
		String descrip = request.getParameter("descrip");
		
		Autor autor = new Autor();
		autor.setNomautor(nomautor);
		autor.setDescrip(descrip);
		
		AutorService autorService = new AutorService();
		autorService.saveAutor(autor);
		
		List<Autor> autors = autorService.autores();
		request.setAttribute("list", autors);
		
		request.getRequestDispatcher("/ListadoAutores.jsp").forward(request, response);
	}

}
