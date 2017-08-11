//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.05.30 às 04:18:20 PM BRT 
//

package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de Lugar complex type.
 * 
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 * 
 * <pre>
 * &lt;complexType name="Lugar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="preco" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lugar", propOrder = { "id", "preco", "status", "local" })
public class Lugar {

	protected int id;
	protected double preco;
	@XmlElement(required = true)
	protected String status;
	@XmlElement(required = true)
	protected String local;

	/**
	 * Obtém o preco da propriedade id.
	 * 
	 */
	public int getId() {
		return id;
	}

	/**
	 * Define o preco da propriedade id.
	 * 
	 */
	public void setId(int value) {
		this.id = value;
	}

	/**
	 * Obtém o preco da propriedade preco.
	 * 
	 */
	public double getPreco() {
		return preco;
	}

	/**
	 * Define o preco da propriedade preco.
	 * 
	 */
	public void setPreco(double value) {
		this.preco = value;
	}

	/**
	 * Obtém o preco da propriedade status.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Define o preco da propriedade status.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatus(Boolean value) {
		if (value) {
			this.status = "OCUPADO";
		} else {
			this.status = "LIVRE";
		}
	}

	/**
	 * Obtém o preco da propriedade local.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLocal() {
		return local;
	}

	/**
	 * Define o preco da propriedade local.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLocal(String value) {
		this.local = value;
	}

	@Override
	public String toString() {
		return "Lugar [id=" + id + ", preco=" + preco + ", status=" + status + ", local=" + local + "]";
	}

}
