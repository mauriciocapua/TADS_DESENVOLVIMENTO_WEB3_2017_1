
package server;

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
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lugares" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="inicioVendas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fimVendas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nome",
    "data",
    "local",
    "lugares",
    "inicioVendas",
    "fimVendas"
})
public class IncluiEvento {

    protected String nome;
    protected String data;
    protected String local;
    protected int lugares;
    protected String inicioVendas;
    protected String fimVendas;

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
     * Obtém o valor da propriedade data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define o valor da propriedade data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Obtém o valor da propriedade local.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocal() {
        return local;
    }

    /**
     * Define o valor da propriedade local.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocal(String value) {
        this.local = value;
    }

    /**
     * Obtém o valor da propriedade lugares.
     * 
     */
    public int getLugares() {
        return lugares;
    }

    /**
     * Define o valor da propriedade lugares.
     * 
     */
    public void setLugares(int value) {
        this.lugares = value;
    }

    /**
     * Obtém o valor da propriedade inicioVendas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInicioVendas() {
        return inicioVendas;
    }

    /**
     * Define o valor da propriedade inicioVendas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInicioVendas(String value) {
        this.inicioVendas = value;
    }

    /**
     * Obtém o valor da propriedade fimVendas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFimVendas() {
        return fimVendas;
    }

    /**
     * Define o valor da propriedade fimVendas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFimVendas(String value) {
        this.fimVendas = value;
    }

}
