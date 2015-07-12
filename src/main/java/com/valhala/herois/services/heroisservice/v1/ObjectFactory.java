
package com.valhala.herois.services.heroisservice.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.valhala.herois.services.heroisservice.v1 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.valhala.herois.services.heroisservice.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IncluirHeroi }
     * 
     */
    public IncluirHeroi createIncluirHeroi() {
        return new IncluirHeroi();
    }

    /**
     * Create an instance of {@link ListarHerois }
     * 
     */
    public ListarHerois createListarHerois() {
        return new ListarHerois();
    }

    /**
     * Create an instance of {@link DeletarHeroi }
     * 
     */
    public DeletarHeroi createDeletarHeroi() {
        return new DeletarHeroi();
    }

    /**
     * Create an instance of {@link EditarHeroi }
     * 
     */
    public EditarHeroi createEditarHeroi() {
        return new EditarHeroi();
    }

    /**
     * Create an instance of {@link ListarHeroisResponse }
     * 
     */
    public ListarHeroisResponse createListarHeroisResponse() {
        return new ListarHeroisResponse();
    }

}
