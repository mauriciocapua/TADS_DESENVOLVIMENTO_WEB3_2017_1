
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cartaoCredito complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cartaoCredito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bandeira" type="{http://WebServices/}bandeira" minOccurs="0"/&gt;
 *         &lt;element name="CV" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dataVencimento" type="{http://WebServices/}localDate" minOccurs="0"/&gt;
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cartaoCredito", propOrder = {
    "bandeira",
    "cv",
    "dataVencimento",
    "nome",
    "numeroCC"
})
public class CartaoCredito {

    @XmlSchemaType(name = "string")
    protected Bandeira bandeira;
    @XmlElement(name = "CV")
    protected int cv;
    protected LocalDate dataVencimento;
    protected String nome;
    protected String numeroCC;

    /**
     * Obtém o valor da propriedade bandeira.
     * 
     * @return
     *     possible object is
     *     {@link Bandeira }
     *     
     */
    public Bandeira getBandeira() {
        return bandeira;
    }

    /**
     * Define o valor da propriedade bandeira.
     * 
     * @param value
     *     allowed object is
     *     {@link Bandeira }
     *     
     */
    public void setBandeira(Bandeira value) {
        this.bandeira = value;
    }

    /**
     * Obtém o valor da propriedade cv.
     * 
     */
    public int getCV() {
        return cv;
    }

    /**
     * Define o valor da propriedade cv.
     * 
     */
    public void setCV(int value) {
        this.cv = value;
    }

    /**
     * Obtém o valor da propriedade dataVencimento.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Define o valor da propriedade dataVencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setDataVencimento(LocalDate value) {
        this.dataVencimento = value;
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
     * Obtém o valor da propriedade numeroCC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCC() {
        return numeroCC;
    }

    /**
     * Define o valor da propriedade numeroCC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCC(String value) {
        this.numeroCC = value;
    }

}
