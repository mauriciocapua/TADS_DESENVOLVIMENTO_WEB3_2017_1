
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DatabaseErrorException_QNAME = new QName("http://server/", "DatabaseErrorException");
    private final static QName _DateErrorException_QNAME = new QName("http://server/", "DateErrorException");
    private final static QName _PersonNotFoundException_QNAME = new QName("http://server/", "PersonNotFoundException");
    private final static QName _UserAuthenticationException_QNAME = new QName("http://server/", "UserAuthenticationException");
    private final static QName _AtribuiPrecoLugar_QNAME = new QName("http://server/", "atribuiPrecoLugar");
    private final static QName _AtribuiPrecoLugarResponse_QNAME = new QName("http://server/", "atribuiPrecoLugarResponse");
    private final static QName _IncluiEvento_QNAME = new QName("http://server/", "incluiEvento");
    private final static QName _IncluiEventoResponse_QNAME = new QName("http://server/", "incluiEventoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatabaseErrorException }
     * 
     */
    public DatabaseErrorException createDatabaseErrorException() {
        return new DatabaseErrorException();
    }

    /**
     * Create an instance of {@link DateErrorException }
     * 
     */
    public DateErrorException createDateErrorException() {
        return new DateErrorException();
    }

    /**
     * Create an instance of {@link PersonNotFoundException }
     * 
     */
    public PersonNotFoundException createPersonNotFoundException() {
        return new PersonNotFoundException();
    }

    /**
     * Create an instance of {@link UserAuthenticationException }
     * 
     */
    public UserAuthenticationException createUserAuthenticationException() {
        return new UserAuthenticationException();
    }

    /**
     * Create an instance of {@link AtribuiPrecoLugar }
     * 
     */
    public AtribuiPrecoLugar createAtribuiPrecoLugar() {
        return new AtribuiPrecoLugar();
    }

    /**
     * Create an instance of {@link AtribuiPrecoLugarResponse }
     * 
     */
    public AtribuiPrecoLugarResponse createAtribuiPrecoLugarResponse() {
        return new AtribuiPrecoLugarResponse();
    }

    /**
     * Create an instance of {@link IncluiEvento }
     * 
     */
    public IncluiEvento createIncluiEvento() {
        return new IncluiEvento();
    }

    /**
     * Create an instance of {@link IncluiEventoResponse }
     * 
     */
    public IncluiEventoResponse createIncluiEventoResponse() {
        return new IncluiEventoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseErrorException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "DatabaseErrorException")
    public JAXBElement<DatabaseErrorException> createDatabaseErrorException(DatabaseErrorException value) {
        return new JAXBElement<DatabaseErrorException>(_DatabaseErrorException_QNAME, DatabaseErrorException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateErrorException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "DateErrorException")
    public JAXBElement<DateErrorException> createDateErrorException(DateErrorException value) {
        return new JAXBElement<DateErrorException>(_DateErrorException_QNAME, DateErrorException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "PersonNotFoundException")
    public JAXBElement<PersonNotFoundException> createPersonNotFoundException(PersonNotFoundException value) {
        return new JAXBElement<PersonNotFoundException>(_PersonNotFoundException_QNAME, PersonNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAuthenticationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "UserAuthenticationException")
    public JAXBElement<UserAuthenticationException> createUserAuthenticationException(UserAuthenticationException value) {
        return new JAXBElement<UserAuthenticationException>(_UserAuthenticationException_QNAME, UserAuthenticationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtribuiPrecoLugar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "atribuiPrecoLugar")
    public JAXBElement<AtribuiPrecoLugar> createAtribuiPrecoLugar(AtribuiPrecoLugar value) {
        return new JAXBElement<AtribuiPrecoLugar>(_AtribuiPrecoLugar_QNAME, AtribuiPrecoLugar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtribuiPrecoLugarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "atribuiPrecoLugarResponse")
    public JAXBElement<AtribuiPrecoLugarResponse> createAtribuiPrecoLugarResponse(AtribuiPrecoLugarResponse value) {
        return new JAXBElement<AtribuiPrecoLugarResponse>(_AtribuiPrecoLugarResponse_QNAME, AtribuiPrecoLugarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncluiEvento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "incluiEvento")
    public JAXBElement<IncluiEvento> createIncluiEvento(IncluiEvento value) {
        return new JAXBElement<IncluiEvento>(_IncluiEvento_QNAME, IncluiEvento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncluiEventoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "incluiEventoResponse")
    public JAXBElement<IncluiEventoResponse> createIncluiEventoResponse(IncluiEventoResponse value) {
        return new JAXBElement<IncluiEventoResponse>(_IncluiEventoResponse_QNAME, IncluiEventoResponse.class, null, value);
    }

}
