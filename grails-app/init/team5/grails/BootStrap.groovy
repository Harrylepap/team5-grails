package team5.grails

class BootStrap {

    def init = { servletContext ->
        test()
    }
    def destroy = {
    }

    void test(){

        def adminRole = new Role(authority: "ROLE_ADMIN").save();
        def clientRole = new Role(authority:  "ROLE_CLIENT").save();

        def admin = new Utilisateur(username:  "admin", password: "admin").save();
        UtilisateurRole.create(admin, adminRole);

        ["riana", "tanjona"].each {
            String username ->
                def userInstance = new Utilisateur(username: username, password: "password")
                (1..5).each {
                    Integer index ->
                        def annonceInstance = new Annonce(
                                title: "Title $username $index",
                                description: "Description de l'annonce $username $index",
                                price: 100*index,
                                active: Boolean.TRUE)
                        (1..5).each {
                            annonceInstance.addToIllustrations(
                                    new Illustration(filename: "filename_$username-$index-$it")
                            )
                        }
                        userInstance.addToAnnonces(annonceInstance)
                        userInstance.save(flush: true, failOnError: true)
                }
                UtilisateurRole.create(userInstance, clientRole)

                UtilisateurRole.withSession {
                    it.flush()
                    it.clear()
                }
        }
    }
}
