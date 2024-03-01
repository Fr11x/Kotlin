class Voiture {
    var marque: String = ""
    var modele: String = ""
    var vitesse: Int = 0
    constructor() {
    }
    constructor(marque: String, modele: String, vitesse: Int) {
        this.marque = marque
        this.modele = modele
        this.vitesse = vitesse
    }
    fun accelerer(vitesse: Int) {
        this.vitesse += vitesse
    }
    fun ralentir(vitesse: Int) {
        this.vitesse -= vitesse
    }
    fun retourneVitesse() : String{
        return "la vitesse actuelle est de${this.vitesse}"
    }
    override fun toString(): String {
        return "Voiture(marque='$marque', modele='$modele', vitesse=$vitesse)"
    }
}

class Nombre {
    var nb: Int = 0

    constructor(nb: Int) {
        this.nb = nb
    }

    fun diviseurs(): List<Int>{

        val div = mutableListOf<Int>()
        for (i in 1..this.nb){
            if (this.nb % i == 0) div.add(i)
        }
        return  div
    }
    fun estPremier(): Boolean{
        val div = listeDiviseurs(nb)
        if (div.size == 2) return true else return false
    }

    fun sommeChiffre(): Int{
        var somme = 0
        var nombre = this.nb
        while (nombre != 0){
            somme += nombre % 10
            nombre /= 10

        }
        return somme
    }
    //fun estAmi(nb2: Nombre): Boolean = if (sommeChiffre(nb) == sommeChiffre(nb2)) true else false

    override fun toString(): String {
        return "Nombre(nb=$nb)"
    }

}

fun main(){
//    val v1 = Voiture()
//    val v2 = Voiture("Volvo","V50",0)
//    v1.marque = "Peugeot"
//    v1.modele = "308"
//    println(v2.modele)
//    v1.accelerer(60)
//    v2.accelerer(40)
//    println(v1.vitesse)
//    println(v2.vitesse)
    val nb1 = Nombre(46)
    val nb2 = Nombre(91)
    println(nb1.diviseurs())
    println(nb2.diviseurs())
    println(nb1.estPremier())
    println(nb2.estPremier())
//
}