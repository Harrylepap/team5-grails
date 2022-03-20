package team5.grails

import grails.databinding.BindUsing

//@Resource(uri = "/api/produits")
class Produit {

    String libelle
    String description
    Double prix
    Boolean active
    Date dateCreated
    Date lastUpdated


    static belongsTo = [auteur: Utilisateur]

    static hasMany = [images: Image]

    static mapping = {
        description type: 'text'
        dateCreated date: new Date()
        active TRUE: Boolean.TRUE
    }

    static constraints = {
        libelle nullable: Boolean.FALSE, blank: Boolean.FALSE, size: 5..255
        description nullable: Boolean.FALSE, blank: Boolean.FALSE
        prix min: 0d
        dateCreated nullable: Boolean.TRUE
        lastUpdated nullable: Boolean.TRUE

    }
}
