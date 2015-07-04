
package com.valhala.herois.services.heroisservice.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.valhala.heroi.domain.v1.Heroi;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="heroi" type="{http://valhala.com/heroi/domain/v1}heroi" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heroi"
})
@XmlRootElement(name = "listarHeroisResponse")
public class ListarHeroisResponse {

    @XmlElement(required = true)
    protected List<Heroi> heroi;

    /**
     * Gets the value of the heroi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heroi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeroi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Heroi }
     * 
     * 
     */
    public List<Heroi> getHeroi() {
        if (heroi == null) {
            heroi = new ArrayList<Heroi>();
        }
        return this.heroi;
    }

}
