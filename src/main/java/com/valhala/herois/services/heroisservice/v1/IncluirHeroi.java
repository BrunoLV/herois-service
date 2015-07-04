
package com.valhala.herois.services.heroisservice.v1;

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
 *         &lt;element name="heroi" type="{http://valhala.com/heroi/domain/v1}heroi"/>
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
@XmlRootElement(name = "incluirHeroi")
public class IncluirHeroi {

    @XmlElement(required = true)
    protected Heroi heroi;

    /**
     * Obtém o valor da propriedade heroi.
     * 
     * @return
     *     possible object is
     *     {@link Heroi }
     *     
     */
    public Heroi getHeroi() {
        return heroi;
    }

    /**
     * Define o valor da propriedade heroi.
     * 
     * @param value
     *     allowed object is
     *     {@link Heroi }
     *     
     */
    public void setHeroi(Heroi value) {
        this.heroi = value;
    }

}
