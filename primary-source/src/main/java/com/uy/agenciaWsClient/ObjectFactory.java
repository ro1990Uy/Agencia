
package com.uy.agenciaWsClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uy.agenciaWsClient package. 
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

    private final static QName _AltaTiketResponse_QNAME = new QName("http://imm.uy.com/", "alta_tiketResponse");
    private final static QName _BajaTiketResponse_QNAME = new QName("http://imm.uy.com/", "baja_tiketResponse");
    private final static QName _AltaTiket_QNAME = new QName("http://imm.uy.com/", "alta_tiket");
    private final static QName _BajaTiket_QNAME = new QName("http://imm.uy.com/", "baja_tiket");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uy.agenciaWsClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BajaTiketResponse }
     * 
     */
    public BajaTiketResponse createBajaTiketResponse() {
        return new BajaTiketResponse();
    }

    /**
     * Create an instance of {@link AltaTiketResponse }
     * 
     */
    public AltaTiketResponse createAltaTiketResponse() {
        return new AltaTiketResponse();
    }

    /**
     * Create an instance of {@link BajaTiket }
     * 
     */
    public BajaTiket createBajaTiket() {
        return new BajaTiket();
    }

    /**
     * Create an instance of {@link AltaTiket }
     * 
     */
    public AltaTiket createAltaTiket() {
        return new AltaTiket();
    }

    /**
     * Create an instance of {@link TicketsEst }
     * 
     */
    public TicketsEst createTicketsEst() {
        return new TicketsEst();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaTiketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imm.uy.com/", name = "alta_tiketResponse")
    public JAXBElement<AltaTiketResponse> createAltaTiketResponse(AltaTiketResponse value) {
        return new JAXBElement<AltaTiketResponse>(_AltaTiketResponse_QNAME, AltaTiketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BajaTiketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imm.uy.com/", name = "baja_tiketResponse")
    public JAXBElement<BajaTiketResponse> createBajaTiketResponse(BajaTiketResponse value) {
        return new JAXBElement<BajaTiketResponse>(_BajaTiketResponse_QNAME, BajaTiketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaTiket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imm.uy.com/", name = "alta_tiket")
    public JAXBElement<AltaTiket> createAltaTiket(AltaTiket value) {
        return new JAXBElement<AltaTiket>(_AltaTiket_QNAME, AltaTiket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BajaTiket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imm.uy.com/", name = "baja_tiket")
    public JAXBElement<BajaTiket> createBajaTiket(BajaTiket value) {
        return new JAXBElement<BajaTiket>(_BajaTiket_QNAME, BajaTiket.class, null, value);
    }

}
