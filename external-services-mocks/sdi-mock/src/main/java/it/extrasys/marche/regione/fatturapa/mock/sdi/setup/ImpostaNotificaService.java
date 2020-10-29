package it.extrasys.marche.regione.fatturapa.mock.sdi.setup;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-04-09T15:11:25.666+02:00
 * Generated source version: 3.0.4
 * 
 */
@WebServiceClient(name = "ImpostaNotificaService", 
                  wsdlLocation = "file:/home/davide/workspace/regione-marche/external-services-mocks/sdi-mock/src/main/resources/setup/ImpostaNotifica.wsdl",
                  targetNamespace = "http://setup.sdi.mock.fatturapa.regione.marche.extrasys.it/") 
public class ImpostaNotificaService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://setup.sdi.mock.fatturapa.regione.marche.extrasys.it/", "ImpostaNotificaService");
    public final static QName ImpostaNotificaPort = new QName("http://setup.sdi.mock.fatturapa.regione.marche.extrasys.it/", "ImpostaNotificaPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/davide/workspace/regione-marche/external-services-mocks/sdi-mock/src/main/resources/setup/ImpostaNotifica.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ImpostaNotificaService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/davide/workspace/regione-marche/external-services-mocks/sdi-mock/src/main/resources/setup/ImpostaNotifica.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ImpostaNotificaService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ImpostaNotificaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImpostaNotificaService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ImpostaNotificaService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ImpostaNotificaService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ImpostaNotificaService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns ImpostaNotifica
     */
    @WebEndpoint(name = "ImpostaNotificaPort")
    public ImpostaNotifica getImpostaNotificaPort() {
        return super.getPort(ImpostaNotificaPort, ImpostaNotifica.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImpostaNotifica
     */
    @WebEndpoint(name = "ImpostaNotificaPort")
    public ImpostaNotifica getImpostaNotificaPort(WebServiceFeature... features) {
        return super.getPort(ImpostaNotificaPort, ImpostaNotifica.class, features);
    }

}
