package team5.grails

class Image {

    String filename

    static constraints = {
        filename nullable: false, blank: false
    }
}
