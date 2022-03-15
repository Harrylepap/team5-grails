package team5.grails

import javax.transaction.Transactional

class BootStrap {

    def init = { servletContext ->
        //addUtilisateurAndProduit()
        testAddProduct()
    }
    def destroy = {
    }

    /**
     * Generation d'utilisateur et de produit
     */
    @Transactional
    def addUtilisateurAndProduit(){
        ["Harrylepap", "Sitraka", "Riana"].each { String username ->
            def utilisateurInstance = new Utilisateur(username: username, email: "$username@ituniversity-mg.com", createdAt: new Date())
            (1..5).each { Integer index ->
                def produitInstance = new Produit(
                        libelle: "Titre $username - $index",
                        description: "Lorem Ipsum is simply dummy text of the printing and typesetting industry. $utilisateurInstance@ituniversity-mg.com",
                        prix: 2 * index,
                        active: Boolean.TRUE
                )
                if(!produitInstance.save())
                    System.out.println("Le produit ne peut pas être sauvegarder")
            }
            if(!utilisateurInstance.save())
                System.out.println("L'utilisateur ne peut pas être sauvegarder")
        }
    }

    @Transactional
    def testAddProduct(){
        new Produit(
                libelle: "Test titre",
                description: "Description test",
                prix: 12,
                dateCreated: new Date(),
                lastUpdated: new Date(),
                auteur: new Utilisateur(username: "harrylepap", email: "rbako@maunexus.com", createdAt: new Date()).save(),
                images: [new Image(filename: "produits/1.jpg").save()],
                active: Boolean.TRUE
        ).save()

    }
}
