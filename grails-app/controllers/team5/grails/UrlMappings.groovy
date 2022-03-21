package team5.grails

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/api/searchAdvancedProduct?libelle=$libelle&categorie=$categorie&offset=$offset"(controller: 'api', action: 'searchAdvancedProduct')

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
