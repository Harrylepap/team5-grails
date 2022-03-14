package team5.grails

class Annonce {

    String libelle
    String description
    Boolean active
    Date dateCreated
    List images

    static mapping = {
        description type: "text"
    }

    static constraints = {
        libelle nullable: Boolean.FALSE, blank: Boolean.FALSE, size: 5..255
        description nullable: Boolean.FALSE, blank: Boolean.FALSE
        active nullable: Boolean.FALSE
    }
}
