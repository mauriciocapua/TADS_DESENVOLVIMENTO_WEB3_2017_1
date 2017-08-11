
package server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.example.trabalho6.Lugar;


/**
 * <p>Classe Java de listaLugaresResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="listaLugaresResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaLugares" type="{http://www.example.org/trabalho6}Lugar" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaLugaresResponse", propOrder = {
    "listaLugares"
})
public class ListaLugaresResponse {

    protected List<Lugar> listaLugares;

    /**
     * Gets the value of the listaLugares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaLugares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaLugares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lugar }
     * 
     * 
     */
    public List<Lugar> getListaLugares() {
        if (listaLugares == null) {
            listaLugares = new ArrayList<Lugar>();
        }
        return this.listaLugares;
    }

}
