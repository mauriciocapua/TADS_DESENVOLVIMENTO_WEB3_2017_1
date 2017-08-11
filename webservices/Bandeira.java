
package webservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de bandeira.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="bandeira"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VISA"/&gt;
 *     &lt;enumeration value="MASTER_CARD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "bandeira")
@XmlEnum
public enum Bandeira {

    VISA,
    MASTER_CARD;

    public String value() {
        return name();
    }

    public static Bandeira fromValue(String v) {
        return valueOf(v);
    }

}
