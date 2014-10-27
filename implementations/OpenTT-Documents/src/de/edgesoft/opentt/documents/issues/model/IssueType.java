
package de.edgesoft.opentt.documents.issues.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssueType">
 *   &lt;complexContent>
 *     &lt;extension base="{}IDType">
 *       &lt;sequence>
 *         &lt;element name="issuecontent" type="{}IssueContentType" maxOccurs="unbounded"/>
 *         &lt;element name="documentref" type="{}RefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rulesref" type="{}RefType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueType", propOrder = {
    "issuecontent",
    "documentref",
    "rulesref"
})
public class IssueType
    extends IDType
{

    @XmlElement(required = true)
    protected List<IssueContentType> issuecontent;
    protected List<RefType> documentref;
    protected List<RefType> rulesref;

    /**
     * Gets the value of the issuecontent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuecontent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuecontent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssueContentType }
     * 
     * 
     */
    public List<IssueContentType> getIssuecontent() {
        if (issuecontent == null) {
            issuecontent = new ArrayList<IssueContentType>();
        }
        return this.issuecontent;
    }

    /**
     * Gets the value of the documentref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefType }
     * 
     * 
     */
    public List<RefType> getDocumentref() {
        if (documentref == null) {
            documentref = new ArrayList<RefType>();
        }
        return this.documentref;
    }

    /**
     * Gets the value of the rulesref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rulesref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRulesref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefType }
     * 
     * 
     */
    public List<RefType> getRulesref() {
        if (rulesref == null) {
            rulesref = new ArrayList<RefType>();
        }
        return this.rulesref;
    }

}