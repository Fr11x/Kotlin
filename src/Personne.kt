class Personne {
    var nom: String = ""
    var poids: Double = 0.0
    var taille: Double = 0.0

    constructor() {
    }

    constructor(nom: String, poids: Double, taille: Double) {
        this.nom = nom
        this.poids = poids
        this.taille = taille
    }

    fun imc(): Double = this.poids/(this.taille * this.taille)

    fun significationImc(): String{
        var res = ""
        if (this.imc() <18.5){
            res = "poids inferieur a la normale"
        }
        else if (this.imc() <25.0){
            res = "poids normale"
        }
        else if (this.imc() <30){
            res = "Surpoids"
        }
        else{
            res = "obesite moderee"
        }
        return res
    }
}