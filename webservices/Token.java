
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de token complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="token"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kind" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="beginLine" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="beginColumn" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="endLine" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="endColumn" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="next" type="{http://WebServices/}token" minOccurs="0"/&gt;
 *         &lt;element name="specialToken" type="{http://WebServices/}token" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "token", propOrder = {
    "kind",
    "beginLine",
    "beginColumn",
    "endLine",
    "endColumn",
    "image",
    "next",
    "specialToken"
})
public class Token {

    protected int kind;
    protected int beginLine;
    protected int beginColumn;
    protected int endLine;
    protected int endColumn;
    protected String image;
    protected Token next;
    protected Token specialToken;

    /**
     * Obtém o valor da propriedade kind.
     * 
     */
    public int getKind() {
        return kind;
    }

    /**
     * Define o valor da propriedade kind.
     * 
     */
    public void setKind(int value) {
        this.kind = value;
    }

    /**
     * Obtém o valor da propriedade beginLine.
     * 
     */
    public int getBeginLine() {
        return beginLine;
    }

    /**
     * Define o valor da propriedade beginLine.
     * 
     */
    public void setBeginLine(int value) {
        this.beginLine = value;
    }

    /**
     * Obtém o valor da propriedade beginColumn.
     * 
     */
    public int getBeginColumn() {
        return beginColumn;
    }

    /**
     * Define o valor da propriedade beginColumn.
     * 
     */
    public void setBeginColumn(int value) {
        this.beginColumn = value;
    }

    /**
     * Obtém o valor da propriedade endLine.
     * 
     */
    public int getEndLine() {
        return endLine;
    }

    /**
     * Define o valor da propriedade endLine.
     * 
     */
    public void setEndLine(int value) {
        this.endLine = value;
    }

    /**
     * Obtém o valor da propriedade endColumn.
     * 
     */
    public int getEndColumn() {
        return endColumn;
    }

    /**
     * Define o valor da propriedade endColumn.
     * 
     */
    public void setEndColumn(int value) {
        this.endColumn = value;
    }

    /**
     * Obtém o valor da propriedade image.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Define o valor da propriedade image.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Obtém o valor da propriedade next.
     * 
     * @return
     *     possible object is
     *     {@link Token }
     *     
     */
    public Token getNext() {
        return next;
    }

    /**
     * Define o valor da propriedade next.
     * 
     * @param value
     *     allowed object is
     *     {@link Token }
     *     
     */
    public void setNext(Token value) {
        this.next = value;
    }

    /**
     * Obtém o valor da propriedade specialToken.
     * 
     * @return
     *     possible object is
     *     {@link Token }
     *     
     */
    public Token getSpecialToken() {
        return specialToken;
    }

    /**
     * Define o valor da propriedade specialToken.
     * 
     * @param value
     *     allowed object is
     *     {@link Token }
     *     
     */
    public void setSpecialToken(Token value) {
        this.specialToken = value;
    }

}
