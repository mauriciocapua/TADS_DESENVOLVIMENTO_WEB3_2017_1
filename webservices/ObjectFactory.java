
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
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

    private final static QName _Exception_QNAME = new QName("http://WebServices/", "Exception");
    private final static QName _IncluiEvento_QNAME = new QName("http://WebServices/", "incluiEvento");
    private final static QName _IncluiEventoResponse_QNAME = new QName("http://WebServices/", "incluiEventoResponse");
    private final static QName _ListaEventos_QNAME = new QName("http://WebServices/", "listaEventos");
    private final static QName _ListaEventosResponse_QNAME = new QName("http://WebServices/", "listaEventosResponse");
    private final static QName _ListaLugares_QNAME = new QName("http://WebServices/", "listaLugares");
    private final static QName _ListaLugaresResponse_QNAME = new QName("http://WebServices/", "listaLugaresResponse");
    private final static QName _PedidoCompraLugar_QNAME = new QName("http://WebServices/", "pedidoCompraLugar");
    private final static QName _PedidoCompraLugarResponse_QNAME = new QName("http://WebServices/", "pedidoCompraLugarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
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
     * Create an instance of {@link ListaEventos }
     * 
     */
    public ListaEventos createListaEventos() {
        return new ListaEventos();
    }

    /**
     * Create an instance of {@link ListaEventosResponse }
     * 
     */
    public ListaEventosResponse createListaEventosResponse() {
        return new ListaEventosResponse();
    }

    /**
     * Create an instance of {@link ListaLugares }
     * 
     */
    public ListaLugares createListaLugares() {
        return new ListaLugares();
    }

    /**
     * Create an instance of {@link ListaLugaresResponse }
     * 
     */
    public ListaLugaresResponse createListaLugaresResponse() {
        return new ListaLugaresResponse();
    }

    /**
     * Create an instance of {@link PedidoCompraLugar }
     * 
     */
    public PedidoCompraLugar createPedidoCompraLugar() {
        return new PedidoCompraLugar();
    }

    /**
     * Create an instance of {@link PedidoCompraLugarResponse }
     * 
     */
    public PedidoCompraLugarResponse createPedidoCompraLugarResponse() {
        return new PedidoCompraLugarResponse();
    }

    /**
     * Create an instance of {@link Evento }
     * 
     */
    public Evento createEvento() {
        return new Evento();
    }

    /**
     * Create an instance of {@link LocalDate }
     * 
     */
    public LocalDate createLocalDate() {
        return new LocalDate();
    }

    /**
     * Create an instance of {@link Lugar }
     * 
     */
    public Lugar createLugar() {
        return new Lugar();
    }

    /**
     * Create an instance of {@link LocalDateTime }
     * 
     */
    public LocalDateTime createLocalDateTime() {
        return new LocalDateTime();
    }

    /**
     * Create an instance of {@link CartaoCredito }
     * 
     */
    public CartaoCredito createCartaoCredito() {
        return new CartaoCredito();
    }

    /**
     * Create an instance of {@link Token }
     * 
     */
    public Token createToken() {
        return new Token();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncluiEvento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "incluiEvento")
    public JAXBElement<IncluiEvento> createIncluiEvento(IncluiEvento value) {
        return new JAXBElement<IncluiEvento>(_IncluiEvento_QNAME, IncluiEvento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncluiEventoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "incluiEventoResponse")
    public JAXBElement<IncluiEventoResponse> createIncluiEventoResponse(IncluiEventoResponse value) {
        return new JAXBElement<IncluiEventoResponse>(_IncluiEventoResponse_QNAME, IncluiEventoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaEventos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listaEventos")
    public JAXBElement<ListaEventos> createListaEventos(ListaEventos value) {
        return new JAXBElement<ListaEventos>(_ListaEventos_QNAME, ListaEventos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaEventosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listaEventosResponse")
    public JAXBElement<ListaEventosResponse> createListaEventosResponse(ListaEventosResponse value) {
        return new JAXBElement<ListaEventosResponse>(_ListaEventosResponse_QNAME, ListaEventosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaLugares }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listaLugares")
    public JAXBElement<ListaLugares> createListaLugares(ListaLugares value) {
        return new JAXBElement<ListaLugares>(_ListaLugares_QNAME, ListaLugares.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaLugaresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "listaLugaresResponse")
    public JAXBElement<ListaLugaresResponse> createListaLugaresResponse(ListaLugaresResponse value) {
        return new JAXBElement<ListaLugaresResponse>(_ListaLugaresResponse_QNAME, ListaLugaresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidoCompraLugar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "pedidoCompraLugar")
    public JAXBElement<PedidoCompraLugar> createPedidoCompraLugar(PedidoCompraLugar value) {
        return new JAXBElement<PedidoCompraLugar>(_PedidoCompraLugar_QNAME, PedidoCompraLugar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidoCompraLugarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "pedidoCompraLugarResponse")
    public JAXBElement<PedidoCompraLugarResponse> createPedidoCompraLugarResponse(PedidoCompraLugarResponse value) {
        return new JAXBElement<PedidoCompraLugarResponse>(_PedidoCompraLugarResponse_QNAME, PedidoCompraLugarResponse.class, null, value);
    }

}
