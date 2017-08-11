
package trab;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de obtemRegiaoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="obtemRegiaoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regiao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtemRegiaoResponse", propOrder = {
    "regiao"
})
public class ObtemRegiaoResponse {

    protected String regiao;

    /**
     * Obtém o valor da propriedade regiao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegiao() {
        return regiao;
    }

    /**
     * Define o valor da propriedade regiao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegiao(String value) {
        this.regiao = value;
    }

}
