
package server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VendasService", targetNamespace = "http://server/", wsdlLocation = "http://user:12345@EREBUS:8080/trabalho6/VendasService?wsdl")
public class VendasService
    extends Service
{

    private final static URL VENDASSERVICE_WSDL_LOCATION;
    private final static WebServiceException VENDASSERVICE_EXCEPTION;
    private final static QName VENDASSERVICE_QNAME = new QName("http://server/", "VendasService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://user:12345@EREBUS:8080/trabalho6/VendasService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VENDASSERVICE_WSDL_LOCATION = url;
        VENDASSERVICE_EXCEPTION = e;
    }

    public VendasService() {
        super(__getWsdlLocation(), VENDASSERVICE_QNAME);
    }

    public VendasService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VENDASSERVICE_QNAME, features);
    }

    public VendasService(URL wsdlLocation) {
        super(wsdlLocation, VENDASSERVICE_QNAME);
    }

    public VendasService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VENDASSERVICE_QNAME, features);
    }

    public VendasService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VendasService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Vendas
     */
    @WebEndpoint(name = "VendasPort")
    public Vendas getVendasPort() {
        return super.getPort(new QName("http://server/", "VendasPort"), Vendas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Vendas
     */
    @WebEndpoint(name = "VendasPort")
    public Vendas getVendasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server/", "VendasPort"), Vendas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VENDASSERVICE_EXCEPTION!= null) {
            throw VENDASSERVICE_EXCEPTION;
        }
        return VENDASSERVICE_WSDL_LOCATION;
    }

}