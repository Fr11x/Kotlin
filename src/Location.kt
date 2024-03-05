class Location {
    var nom = ""
    var categorie = ""
    var nbKm = 0.0
    var jours = 0.0

    constructor()
    constructor(nom: String, categorie: String, nbKm: Double, jours: Double) {
        this.nom = nom
        this.categorie = categorie
        this.nbKm = nbKm
        this.jours = jours
    }

    fun prixJour() = if (this.categorie == "E") 30.0 else if (this.categorie == "C") 50.0
                    else if (this.categorie == "L") 75.0 else 0.0
    fun montantLocation() = this.prixJour() * jours
    fun kmSupplementaire() = if (this.nbKm > 100.0) this.nbKm - 100.0 else 0.0
    fun pxkmSupplementaire() = 0.5 * this.kmSupplementaire()

    fun montantTotal() = this.montantLocation() + this.pxkmSupplementaire()

}