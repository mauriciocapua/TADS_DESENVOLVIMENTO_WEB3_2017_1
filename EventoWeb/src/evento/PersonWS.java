//package evento;
//import java.util.List;
//
//import javax.annotation.Resource;
//import javax.jws.WebMethod;
//import javax.jws.WebParam;
//import javax.jws.WebResult;
//import javax.jws.WebService;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import javax.sql.DataSource;
//
//import exceptions.DatabaseErrorException;
//import exceptions.PersonNotFoundException;
//import exceptions.UserAuthenticationException;
//import modelos.Person;
//import modelos.PersonDAO;
//import modelos.User;
//
//@WebService
//public class PersonWS {
//
//	@Resource(mappedName = "jdbc/eventos")
//	private DataSource dataSource;
//
//	private PersonDAO personDAO;
//
//	public PersonWS() throws NamingException {
//		//personDAO = new PersonDAO(dataSource);
//		personDAO = new PersonDAO((DataSource) new InitialContext().lookup("jdbc/eventos"));
//	}
//
//	@WebMethod
//	@WebResult(name = "person")
//	public List<Person> listAll(@WebParam(name = "user", header = true) User user)
//			throws DatabaseErrorException, UserAuthenticationException {
//		if ((user != null) && ("admin".equals(user.getLogin())) && ("12345".equals(user.getPassword())))
//			return(personDAO.getAll());
//		else
//			throw new UserAuthenticationException();
//	}
//	@WebMethod
//	@WebResult(name = "person")
//	public List<Person> outroListAll() throws DatabaseErrorException {
//			return(personDAO.getAll());
//	}
//
//	@WebMethod
//	@WebResult(name = "person")
//	public Person listById(@WebParam(name = "user", header = true) User user, @WebParam(name = "id") int id)
//			throws PersonNotFoundException, DatabaseErrorException, UserAuthenticationException {
//		if ((user != null) && ("admin".equals(user.getLogin())) && ("12345".equals(user.getPassword()))) {
//			Person p = personDAO.getById(id);
//			if (p != null)
//				return(p);
//			else
//				throw new PersonNotFoundException();
//		} else
//			throw new UserAuthenticationException();
//	}
//
//}