
package com.valhala.heroi.domain.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de heroi complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="heroi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="editora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anoPrimeriaAparicao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "heroi", propOrder = {
    "id",
    "nome",
    "editora",
    "anoPrimeriaAparicao"
})
public class Heroi {

    protected long id;
    @XmlElement(required = true)
    protected String nome;
    @XmlElement(required = true)
    protected String editora;
    @XmlElement(required = true)
    protected String anoPrimeriaAparicao;

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade editora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditora() {
        return editora;
    }

    /**
     * Define o valor da propriedade editora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditora(String value) {
        this.editora = value;
    }

    /**
     * Obtém o valor da propriedade anoPrimeriaAparicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoPrimeriaAparicao() {
        return anoPrimeriaAparicao;
    }

    /**
     * Define o valor da propriedade anoPrimeriaAparicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoPrimeriaAparicao(String value) {
        this.anoPrimeriaAparicao = value;
    }

}
