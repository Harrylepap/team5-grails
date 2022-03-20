package team5.grails

import grails.converters.JSON
import grails.converters.XML

class ApiController {

    //api/produits/{id}
    def produits() {
        def produitInstance

        // recuperation de la methode HTTP de l'utilisateur
        switch (request.getMethod()){
            case "GET":
                if (!params.id){
                    produitInstance = Produit.list()
                }else{
                    produitInstance = Produit.get (params.id)
                }

                if (!produitInstance)
                    return response.status = 404

                response.withFormat {
                    json { render produitInstance as JSON }
                }

                break;
            case "POST":
                break
            case "PUT":
                break
            case "DELETE":
                break
            default:
                break
        }
        return response.status = 406
    }
}
