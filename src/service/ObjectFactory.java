
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _GetComptsResponse_QNAME = new QName("http://service/", "getComptsResponse");
    private final static QName _GetCompteResponse_QNAME = new QName("http://service/", "getCompteResponse");
    private final static QName _ConversionEuroToDAResponse_QNAME = new QName("http://service/", "ConversionEuroToDAResponse");
    private final static QName _ConversionEuroToDA_QNAME = new QName("http://service/", "ConversionEuroToDA");
    private final static QName _GetCompte_QNAME = new QName("http://service/", "getCompte");
    private final static QName _Compte_QNAME = new QName("http://service/", "compte");
    private final static QName _GetCompts_QNAME = new QName("http://service/", "getCompts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompts }
     * 
     */
    public GetCompts createGetCompts() {
        return new GetCompts();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link ConversionEuroToDA }
     * 
     */
    public ConversionEuroToDA createConversionEuroToDA() {
        return new ConversionEuroToDA();
    }

    /**
     * Create an instance of {@link ConversionEuroToDAResponse }
     * 
     */
    public ConversionEuroToDAResponse createConversionEuroToDAResponse() {
        return new ConversionEuroToDAResponse();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link GetComptsResponse }
     * 
     */
    public GetComptsResponse createGetComptsResponse() {
        return new GetComptsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getComptsResponse")
    public JAXBElement<GetComptsResponse> createGetComptsResponse(GetComptsResponse value) {
        return new JAXBElement<GetComptsResponse>(_GetComptsResponse_QNAME, GetComptsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ConversionEuroToDAResponse")
    public JAXBElement<ConversionEuroToDAResponse> createConversionEuroToDAResponse(ConversionEuroToDAResponse value) {
        return new JAXBElement<ConversionEuroToDAResponse>(_ConversionEuroToDAResponse_QNAME, ConversionEuroToDAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ConversionEuroToDA")
    public JAXBElement<ConversionEuroToDA> createConversionEuroToDA(ConversionEuroToDA value) {
        return new JAXBElement<ConversionEuroToDA>(_ConversionEuroToDA_QNAME, ConversionEuroToDA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCompts")
    public JAXBElement<GetCompts> createGetCompts(GetCompts value) {
        return new JAXBElement<GetCompts>(_GetCompts_QNAME, GetCompts.class, null, value);
    }

}
