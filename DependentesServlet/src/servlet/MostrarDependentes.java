package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Cliente;
import modelo.Dependente;

/**
 * Servlet implementation class MostrarDependentes
 */
@WebServlet("/MostrarDependentes")
public class MostrarDependentes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarDependentes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idCliente = "erro";
		if (request.getParameter("idCliente") != null){
			idCliente = request.getParameter("idCliente");
		}
		
		String nomeDependente = request.getParameter("nome");
		
		
		if(!nomeDependente.isEmpty()){
			try {
				Cliente.adicionarDependente(nomeDependente, Integer.parseInt(idCliente));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
        List<Cliente> vetCliente = null;
        List<Dependente> vetDependente = null;
		try {
			vetCliente = Cliente.listarTodos();
	        vetDependente = Cliente.listarTodosDependentes();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("vetCliente", vetCliente);
		request.setAttribute("vetDependente", vetDependente);
		RequestDispatcher rd = request.getRequestDispatcher("/mostra.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
