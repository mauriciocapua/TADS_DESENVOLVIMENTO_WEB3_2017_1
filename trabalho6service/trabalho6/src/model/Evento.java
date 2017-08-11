//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.05.30 às 04:18:20 PM BRT 
//

package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Classe Java de Evento complex type.
 * 
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 * 
 * <pre>
 * &lt;complexType name="Evento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="horaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="horaFim" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lugares" type="{http://www.example.org/trabalho6}Lugar"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Evento", propOrder = { "id", "nome", "data", "horaInicio", "horaFim", "local", "lugares" })
public class Evento {

	protected int id;
	@XmlElement(required = true)
	protected String nome;
	@XmlElement(required = true, type = String.class)
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	@XmlSchemaType(name = "date")
	protected LocalDate data;
	@XmlElement(required = true, type = String.class)
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	@XmlSchemaType(name = "dateTime")
	protected LocalDateTime horaInicio;
	@XmlElement(required = true, type = String.class)
	@XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
	@XmlSchemaType(name = "dateTime")
	protected LocalDateTime horaFim;
	@XmlElement(required = true)
	protected String local;
	@XmlElement(required = true)
	protected Lugar lugares;

	public Evento(int int1, String string, LocalDate parse, LocalDateTime localDateTime, LocalDateTime localDateTime2,
			String string2, Object object) {
		// TODO Auto-generated constructor stub
	}

	public Evento() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obtém o valor da propriedade id.
	 * 
	 */
	public int getId() {
		return id;
	}

	/**
	 * Define o valor da propriedade id.
	 * 
	 */
	public void setId(int value) {
		this.id = value;
	}

	/**
	 * Obtém o valor da propriedade nome.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define o valor da propriedade nome.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNome(String value) {
		this.nome = value;
	}

	/**
	 * Obtém o valor da propriedade data.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public LocalDate getData() {
		return data;
	}

	/**
	 * Define o valor da propriedade data.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setData(LocalDate value) {
		this.data = value;
	}

	/**
	 * Obtém o valor da propriedade horaInicio.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public LocalDateTime getHoraInicio() {
		return horaInicio;
	}

	/**
	 * Define o valor da propriedade horaInicio.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHoraInicio(LocalDateTime value) {
		this.horaInicio = value;
	}

	/**
	 * Obtém o valor da propriedade horaFim.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public LocalDateTime getHoraFim() {
		return horaFim;
	}

	/**
	 * Define o valor da propriedade horaFim.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHoraFim(LocalDateTime value) {
		this.horaFim = value;
	}

	/**
	 * Obtém o valor da propriedade local.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLocal() {
		return local;
	}

	/**
	 * Define o valor da propriedade local.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLocal(String value) {
		this.local = value;
	}

	/**
	 * Obtém o valor da propriedade lugares.
	 * 
	 * @return possible object is {@link Lugar }
	 * 
	 */
	public Lugar getLugares() {
		return lugares;
	}

	/**
	 * Define o valor da propriedade lugares.
	 * 
	 * @param value
	 *            allowed object is {@link Lugar }
	 * 
	 */
	public void setLugares(Lugar value) {
		this.lugares = value;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", nome=" + nome + ", data=" + data + ", horaInicio=" + horaInicio + ", horaFim="
				+ horaFim + ", local=" + local + ", lugares=" + lugares + "]";
	}

}
