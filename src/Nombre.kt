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
    fun estAmi(nb2: Nombre): Boolean = if (this.sommeChiffre() == nb2.sommeChiffre()) true else false

    override fun toString(): String {
        return "Nombre(nb=$nb)"
    }

}
