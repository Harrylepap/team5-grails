package team5.grails

class BootStrap {

    def init = { servletContext ->
        ["Harrylepap", "Sitraka", "Riana"].each { String username ->
            def utilisateurInstance = new Utilisateur(username: username, email: "$username@ituniversity-mg.com")
            (1..5).each { Integer index ->
                def produitInstance = new Produit(
                        libelle: "Titre $username - $index",
                        description: "Lorem Ipsum is simply dummy text of the printing and typesetting industry. $utilisateurInstance@ituniversity-mg.com",
                        prix: 2 * index,
                        active: Boolean.TRUE
                )
            }
            utilisateurInstance.save()
        }
    }
    def destroy = {
    }
}
