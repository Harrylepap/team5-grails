package team5.grails

import javax.transaction.Transactional

class BootStrap {

    def init = { servletContext ->
        test()
    }
    def destroy = {
    }

    @Transactional
    void test(){

        def adminRole = new Role(authority: "ROLE_ADMIN").save();
        def clientRole = new Role(authority:  "ROLE_CLIENT").save();

        def admin = new Utilisateur(username:  "admin", password: "admin").save();
        UtilisateurRole.create(admin, adminRole);

        ["riana", "sitraka", "bako"].each {
            String username ->
                def userInstance = new Utilisateur(username: username, password: "password")
                (1..5).each {
                    Integer index ->
                        def produitInstance = new Produit(
                                libelle: "Test titre",
                                description: "Description Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                                prix: 12,
                                dateCreated: new Date(),
                                lastUpdated: new Date(),
                                auteur: userInstance,
                                active: Boolean.TRUE,
                        )
                        (1..3).each {
                            produitInstance.addToImages( new Image(filename: "fichier_$username-$index-$it-a.jpg"))
                            produitInstance.errors.getAllErrors().each {
                                println(it)
                            }
                        }
                        userInstance.addToProduits(produitInstance)
                        userInstance.save()
                }
                UtilisateurRole.create(userInstance, clientRole)

                UtilisateurRole.withSession {
                    it.flush()
                    it.clear()
                }
        }
    }
}
