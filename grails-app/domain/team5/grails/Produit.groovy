package team5.grails

class Produit {

    String libelle
    String description
    Double prix
    Boolean active
    Date dateCreated
    Date lastUpdated
    List images

    static mapping = {
        description type: "text"
    }

    static constraints = {
        libelle nullable: Boolean.FALSE, blank: Boolean.FALSE, size: 5..255
        description nullable: Boolean.FALSE, blank: Boolean.FALSE
        prix min: 0d
        active nullable: Boolean.FALSE
    }
}
