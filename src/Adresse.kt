class Adresse {
    var rue = ""
    var ville = ""
    var codePostal = ""

    constructor()
    constructor(rue: String, ville: String, codePostal: String) {
        this.rue = rue
        this.ville = ville
        this.codePostal = codePostal
    }


    override fun toString(): String {
        return "Adresse(rue='$rue', ville='$ville', codePostal='$codePostal')"
    }


}


