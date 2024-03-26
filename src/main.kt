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


//  val nb1 = Nombre(46)
//    val nb2 = Nombre(51)
//    println(nb1.diviseurs())
//    println(nb2.diviseurs())
//    println(nb1.estPremier())
//    println(nb2.estAmi(nb1))

//    val p1= Personne("Paul",62.0,1.85)
//    println(p1.imc())
//    println(p1.significationImc())

////
//    var prout = Location("Volvo","E",150.0,10.0)
//    println(prout.montantLocation())
//    println(prout.kmSupplementaire())
//    println(prout.pxkmSupplementaire())
//    println(prout.montantTotal())
//
//    var employe = Employe(1,"caca","pipi",2010,1500.0)
//    employe.afficherEmployer()

    var lesPersonne= mutableListOf<Personne>()
    var cumultaille = 0.0
    var cumulpoids = 0.0
    lesPersonne.add(Personne("toto",85.5,1.85))
    lesPersonne.add(Personne("titi",92.0,1.75))
    lesPersonne.add(Personne("popo",80.0,1.74))
    lesPersonne.add(Personne("titi",92.0,1.70))
    lesPersonne.add(Personne("tata",110.0,1.95))
    for (unePersonne in lesPersonne){
        cumultaille += unePersonne.taille
        cumulpoids += unePersonne.poids
    }
    println(cumultaille/lesPersonne.size)
    println(cumulpoids/lesPersonne.size)
    val list = emptyMap()
    println(list)
}