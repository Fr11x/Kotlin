fun main() {
//    val v1 = Voiture()
//    val v2 = Voiture("Volvo","V50",0)
//    v1.marque = "Peugeot"
//    v1.modele = "308"
//    println(v2.modele)
//    v1.accelerer(60)
//    v2.accelerer(40)
//    println(v1.vitesse)
//    println(v2.vitesse)


//    val nb1 = Nombre(46)
//    val nb2 = Nombre(51)
//    println(nb1.diviseurs())
//    println(nb2.diviseurs())
//    println(nb1.estPremier())
//    println(nb2.estAmi(nb1))

//    val p1= Personne("Paul",62.0,1.85)
//    println(p1.imc())
//    println(p1.significationImc())

//    var loca1 = Location("Pierre","E",125.0,10.0)
//    println(loca1.prixJour())
//    println(loca1.montantLocation())
//    println(loca1.kmSupplementaire())
//    println(loca1.pxkmSupplementaire())
//    println(loca1.montantTotal())

    var compte = Compte(50.0)
    compte.retirer(20.0)
    println(compte.getBalance())
    compte.depose(15.5)
    println(compte.getBalance())
    compte.ajouterInteret(0.8)
    println(compte.getBalance())



}