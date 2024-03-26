import java.time.LocalDate
class Employe {
    var matricule = 0
    var nom = ""
    var prenom = ""
    var anneeEmbauche = 0
    var salaire = 0.0

    constructor()
    constructor(matricule: Int, nom: String, prenom: String, anneeEmbauche: Int, salaire: Double) {
        this.matricule = matricule
        this.nom = nom
        this.prenom = prenom
        this.anneeEmbauche = anneeEmbauche
        this.salaire = salaire
    }
    fun anciennete() = LocalDate.now().year - this.anneeEmbauche
    fun augmentationDuSalaire() = if (anciennete()< 5) this.salaire *= 1.02 else if (anciennete() < 10)
        this.salaire = 1.05 else this.salaire = 1.1
    fun afficherEmployer(){
        println("Nom complet: ${this.nom.uppercase()} ${this.prenom.lowercase().capitalize()}")
        println("Anciennete: ${anciennete()}")
        println("Salaire: ${this.salaire}")
    }

}