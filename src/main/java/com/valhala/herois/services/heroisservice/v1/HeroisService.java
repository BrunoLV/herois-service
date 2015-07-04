
package com.valhala.herois.services.heroisservice.v1;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.valhala.heroi.domain.v1.Heroi;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HeroisService", targetNamespace = "http://valhala.com/herois/services/HeroisService/v1")
@XmlSeeAlso({
    com.valhala.heroi.domain.v1.ObjectFactory.class,
    com.valhala.herois.services.heroisservice.v1.ObjectFactory.class
})
public interface HeroisService {


    /**
     * 
     * @return
     *     returns java.util.List<com.valhala.heroi.domain.v1.Heroi>
     */
    @WebMethod(action = "HeroisService/ListarHerois")
    @WebResult(name = "heroi", targetNamespace = "")
    @RequestWrapper(localName = "listarHerois", targetNamespace = "http://valhala.com/herois/services/HeroisService/v1", className = "com.valhala.herois.services.heroisservice.v1.ListarHerois")
    @ResponseWrapper(localName = "listarHeroisResponse", targetNamespace = "http://valhala.com/herois/services/HeroisService/v1", className = "com.valhala.herois.services.heroisservice.v1.ListarHeroisResponse")
    public List<Heroi> listarHerois();

    /**
     * 
     * @param heroi
     */
    @WebMethod(action = "HeroisService/IncluirHeroi")
    @Oneway
    @RequestWrapper(localName = "incluirHeroi", targetNamespace = "http://valhala.com/herois/services/HeroisService/v1", className = "com.valhala.herois.services.heroisservice.v1.IncluirHeroi")
    public void incluirHeroi(
        @WebParam(name = "heroi", targetNamespace = "")
        Heroi heroi);

}
