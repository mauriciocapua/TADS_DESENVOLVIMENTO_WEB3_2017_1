
package trab;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the trab package. 
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

    private final static QName _ObtemUFResponse_QNAME = new QName("http://trab/", "obtemUFResponse");
    private final static QName _ObtemRegiaoResponse_QNAME = new QName("http://trab/", "obtemRegiaoResponse");
    private final static QName _ObtemUF_QNAME = new QName("http://trab/", "obtemUF");
    private final static QName _ObtemRegiao_QNAME = new QName("http://trab/", "obtemRegiao");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: trab
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtemUFResponse }
     * 
     */
    public ObtemUFResponse createObtemUFResponse() {
        return new ObtemUFResponse();
    }

    /**
     * Create an instance of {@link ObtemRegiaoResponse }
     * 
     */
    public ObtemRegiaoResponse createObtemRegiaoResponse() {
        return new ObtemRegiaoResponse();
    }

    /**
     * Create an instance of {@link ObtemRegiao }
     * 
     */
    public ObtemRegiao createObtemRegiao() {
        return new ObtemRegiao();
    }

    /**
     * Create an instance of {@link ObtemUF }
     * 
     */
    public ObtemUF createObtemUF() {
        return new ObtemUF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtemUFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trab/", name = "obtemUFResponse")
    public JAXBElement<ObtemUFResponse> createObtemUFResponse(ObtemUFResponse value) {
        return new JAXBElement<ObtemUFResponse>(_ObtemUFResponse_QNAME, ObtemUFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtemRegiaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trab/", name = "obtemRegiaoResponse")
    public JAXBElement<ObtemRegiaoResponse> createObtemRegiaoResponse(ObtemRegiaoResponse value) {
        return new JAXBElement<ObtemRegiaoResponse>(_ObtemRegiaoResponse_QNAME, ObtemRegiaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtemUF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trab/", name = "obtemUF")
    public JAXBElement<ObtemUF> createObtemUF(ObtemUF value) {
        return new JAXBElement<ObtemUF>(_ObtemUF_QNAME, ObtemUF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtemRegiao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trab/", name = "obtemRegiao")
    public JAXBElement<ObtemRegiao> createObtemRegiao(ObtemRegiao value) {
        return new JAXBElement<ObtemRegiao>(_ObtemRegiao_QNAME, ObtemRegiao.class, null, value);
    }

}
