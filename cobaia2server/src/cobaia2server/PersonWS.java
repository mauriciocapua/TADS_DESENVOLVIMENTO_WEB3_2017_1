package cobaia2server;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class PersonWS {

	@WebMethod
	@WebResult(name="person")
	public List<Person> listAll() {
		return(PersonDAO.getAll());
	}

	@WebMethod
	@WebResult(name="person")
	public Person listById(@WebParam(name="id") int id) {
		return(PersonDAO.getById(id));
	}

}
