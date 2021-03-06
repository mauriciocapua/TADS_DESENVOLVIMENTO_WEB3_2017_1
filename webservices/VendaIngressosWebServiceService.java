
package webservices;

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
@WebServiceClient(name = "VendaIngressosWebServiceService", targetNamespace = "http://WebServices/", wsdlLocation = "http://erebus:8080/VendaDeIngressos/VendaIngressosWebServiceService?wsdl")
public class VendaIngressosWebServiceService
    extends Service
{

    private final static URL VENDAINGRESSOSWEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException VENDAINGRESSOSWEBSERVICESERVICE_EXCEPTION;
    private final static QName VENDAINGRESSOSWEBSERVICESERVICE_QNAME = new QName("http://WebServices/", "VendaIngressosWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://erebus:8080/VendaDeIngressos/VendaIngressosWebServiceService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VENDAINGRESSOSWEBSERVICESERVICE_WSDL_LOCATION = url;
        VENDAINGRESSOSWEBSERVICESERVICE_EXCEPTION = e;
    }

    public VendaIngressosWebServiceService() {
        super(__getWsdlLocation(), VENDAINGRESSOSWEBSERVICESERVICE_QNAME);
    }

    public VendaIngressosWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VENDAINGRESSOSWEBSERVICESERVICE_QNAME, features);
    }

    public VendaIngressosWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, VENDAINGRESSOSWEBSERVICESERVICE_QNAME);
    }

    public VendaIngressosWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VENDAINGRESSOSWEBSERVICESERVICE_QNAME, features);
    }

    public VendaIngressosWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VendaIngressosWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VendaIngressosWebService
     */
    @WebEndpoint(name = "VendaIngressosWebServicePort")
    public VendaIngressosWebService getVendaIngressosWebServicePort() {
        return super.getPort(new QName("http://WebServices/", "VendaIngressosWebServicePort"), VendaIngressosWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VendaIngressosWebService
     */
    @WebEndpoint(name = "VendaIngressosWebServicePort")
    public VendaIngressosWebService getVendaIngressosWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebServices/", "VendaIngressosWebServicePort"), VendaIngressosWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VENDAINGRESSOSWEBSERVICESERVICE_EXCEPTION!= null) {
            throw VENDAINGRESSOSWEBSERVICESERVICE_EXCEPTION;
        }
        return VENDAINGRESSOSWEBSERVICESERVICE_WSDL_LOCATION;
    }

}
