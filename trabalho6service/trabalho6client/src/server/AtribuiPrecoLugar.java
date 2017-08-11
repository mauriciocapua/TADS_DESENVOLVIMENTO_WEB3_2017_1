
package server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de atribuiPrecoLugar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="atribuiPrecoLugar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventoId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lugarInicial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lugarFinal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="preco" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atribuiPrecoLugar", propOrder = {
    "eventoId",
    "lugarInicial",
    "lugarFinal",
    "preco"
})
public class AtribuiPrecoLugar {

    protected Integer eventoId;
    protected Integer lugarInicial;
    protected Integer lugarFinal;
    protected Double preco;

    /**
     * Obtém o valor da propriedade eventoId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEventoId() {
        return eventoId;
    }

    /**
     * Define o valor da propriedade eventoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEventoId(Integer value) {
        this.eventoId = value;
    }

    /**
     * Obtém o valor da propriedade lugarInicial.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLugarInicial() {
        return lugarInicial;
    }

    /**
     * Define o valor da propriedade lugarInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLugarInicial(Integer value) {
        this.lugarInicial = value;
    }

    /**
     * Obtém o valor da propriedade lugarFinal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLugarFinal() {
        return lugarFinal;
    }

    /**
     * Define o valor da propriedade lugarFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLugarFinal(Integer value) {
        this.lugarFinal = value;
    }

    /**
     * Obtém o valor da propriedade preco.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * Define o valor da propriedade preco.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreco(Double value) {
        this.preco = value;
    }

}
