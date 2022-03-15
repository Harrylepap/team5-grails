package team5.grails

import grails.rest.Resource

@Resource(uri = "/api/utilisateurs")
class Utilisateur {

    String username
    String email
    Date createdAt

    static hasMany = [produits: Produit]

    static constraints = {
        username nullable: Boolean.FALSE, blank: Boolean.FALSE, size: 3..25, unique: Boolean.TRUE
        email nullable: Boolean.FALSE, blank: Boolean.FALSE, unique: Boolean.TRUE
        createdAt nullable: Boolean.TRUE
    }
}
