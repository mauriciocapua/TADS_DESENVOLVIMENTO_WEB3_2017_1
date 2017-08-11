
package server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de listaLugares complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="listaLugares"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaLugares", propOrder = {
    "eventoId"
})
public class ListaLugares {

    protected String eventoId;

    /**
     * Obtém o valor da propriedade eventoId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventoId() {
        return eventoId;
    }

    /**
     * Define o valor da propriedade eventoId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventoId(String value) {
        this.eventoId = value;
    }

}
