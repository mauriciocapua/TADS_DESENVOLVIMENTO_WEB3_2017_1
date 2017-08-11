
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de incluiEvento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="incluiEvento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://WebServices/}evento" minOccurs="0"/&gt;
 *         &lt;element name="arg1" type="{http://WebServices/}localDateTime" minOccurs="0"/&gt;
 *         &lt;element name="arg2" type="{http://WebServices/}localDateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "incluiEvento", propOrder = {
    "arg0",
    "arg1",
    "arg2"
})
public class IncluiEvento {

    protected Evento arg0;
    protected LocalDateTime arg1;
    protected LocalDateTime arg2;

    /**
     * Obtém o valor da propriedade arg0.
     * 
     * @return
     *     possible object is
     *     {@link Evento }
     *     
     */
    public Evento getArg0() {
        return arg0;
    }

    /**
     * Define o valor da propriedade arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Evento }
     *     
     */
    public void setArg0(Evento value) {
        this.arg0 = value;
    }

    /**
     * Obtém o valor da propriedade arg1.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getArg1() {
        return arg1;
    }

    /**
     * Define o valor da propriedade arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setArg1(LocalDateTime value) {
        this.arg1 = value;
    }

    /**
     * Obtém o valor da propriedade arg2.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getArg2() {
        return arg2;
    }

    /**
     * Define o valor da propriedade arg2.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setArg2(LocalDateTime value) {
        this.arg2 = value;
    }

}
