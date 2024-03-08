class Compte {
    var soldeInitial = 0.0

    constructor()
    constructor(soldeInitial: Double) {
        this.soldeInitial = soldeInitial
    }
    fun retirer(retrait: Double){this.soldeInitial -= retrait}
    fun depose(ajout: Double){this.soldeInitial +=ajout }
    fun getBalance() = this.soldeInitial
    fun ajouterInteret(taux: Double){
        this.soldeInitial = this.soldeInitial * (1+ taux)
    }
}