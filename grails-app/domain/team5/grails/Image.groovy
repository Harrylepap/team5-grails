package team5.grails

import grails.rest.Resource

@Resource(uri = "/api/images")
class Image {

    String filename
    Produit produit
    static constraints = {
        filename nullable: true, blank: true
        produit nullable: Boolean.TRUE
    }
}
