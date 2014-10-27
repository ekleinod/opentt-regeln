
package de.edgesoft.opentt.documents.issues.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.edgesoft.opentt.documents.issues.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Issuedocument_QNAME = new QName("", "issuedocument");
    private final static QName _Rules_QNAME = new QName("", "rules");
    private final static QName _TextWithLinksTypeDocumentref_QNAME = new QName("", "documentref");
    private final static QName _TextWithLinksTypeRulesref_QNAME = new QName("", "rulesref");
    private final static QName _TextWithLinksTypeAuthorref_QNAME = new QName("", "authorref");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.edgesoft.opentt.documents.issues.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IssueDocumentType }
     * 
     */
    public IssueDocumentType createIssueDocumentType() {
        return new IssueDocumentType();
    }

    /**
     * Create an instance of {@link RulesType }
     * 
     */
    public RulesType createRulesType() {
        return new RulesType();
    }

    /**
     * Create an instance of {@link RuleType }
     * 
     */
    public RuleType createRuleType() {
        return new RuleType();
    }

    /**
     * Create an instance of {@link TextWithLinksType }
     * 
     */
    public TextWithLinksType createTextWithLinksType() {
        return new TextWithLinksType();
    }

    /**
     * Create an instance of {@link VersionType }
     * 
     */
    public VersionType createVersionType() {
        return new VersionType();
    }

    /**
     * Create an instance of {@link ParasType }
     * 
     */
    public ParasType createParasType() {
        return new ParasType();
    }

    /**
     * Create an instance of {@link IssueType }
     * 
     */
    public IssueType createIssueType() {
        return new IssueType();
    }

    /**
     * Create an instance of {@link AuthorContentType }
     * 
     */
    public AuthorContentType createAuthorContentType() {
        return new AuthorContentType();
    }

    /**
     * Create an instance of {@link RuleContentType }
     * 
     */
    public RuleContentType createRuleContentType() {
        return new RuleContentType();
    }

    /**
     * Create an instance of {@link DocumentContentType }
     * 
     */
    public DocumentContentType createDocumentContentType() {
        return new DocumentContentType();
    }

    /**
     * Create an instance of {@link AuthorType }
     * 
     */
    public AuthorType createAuthorType() {
        return new AuthorType();
    }

    /**
     * Create an instance of {@link IssueContentType }
     * 
     */
    public IssueContentType createIssueContentType() {
        return new IssueContentType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link RefType }
     * 
     */
    public RefType createRefType() {
        return new RefType();
    }

    /**
     * Create an instance of {@link AnswerType }
     * 
     */
    public AnswerType createAnswerType() {
        return new AnswerType();
    }

    /**
     * Create an instance of {@link QNAType }
     * 
     */
    public QNAType createQNAType() {
        return new QNAType();
    }

    /**
     * Create an instance of {@link InfoType }
     * 
     */
    public InfoType createInfoType() {
        return new InfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "issuedocument")
    public JAXBElement<IssueDocumentType> createIssuedocument(IssueDocumentType value) {
        return new JAXBElement<IssueDocumentType>(_Issuedocument_QNAME, IssueDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RulesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rules")
    public JAXBElement<RulesType> createRules(RulesType value) {
        return new JAXBElement<RulesType>(_Rules_QNAME, RulesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "documentref", scope = TextWithLinksType.class)
    public JAXBElement<RefType> createTextWithLinksTypeDocumentref(RefType value) {
        return new JAXBElement<RefType>(_TextWithLinksTypeDocumentref_QNAME, RefType.class, TextWithLinksType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rulesref", scope = TextWithLinksType.class)
    public JAXBElement<RefType> createTextWithLinksTypeRulesref(RefType value) {
        return new JAXBElement<RefType>(_TextWithLinksTypeRulesref_QNAME, RefType.class, TextWithLinksType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "authorref", scope = TextWithLinksType.class)
    public JAXBElement<RefType> createTextWithLinksTypeAuthorref(RefType value) {
        return new JAXBElement<RefType>(_TextWithLinksTypeAuthorref_QNAME, RefType.class, TextWithLinksType.class, value);
    }

}