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

    val lesPersonne= mutableListOf<Personne>()
    var cumultaille = 0.0
    var cumulpoids = 0.0
    lesPersonne.add(Personne("toto",85.5,1.85))
    lesPersonne.add(Personne("titi",92.0,1.75, Adresse("28 rue jean claude","Sav","77240")))
    lesPersonne.add(Personne("popo",80.0,1.74, Adresse("28 rue jean jaque","vert-saint-denis","77240")))
    lesPersonne.add(Personne("titi",92.0,1.70, Adresse("26 rue jean pierre","Melun","77000")))
    lesPersonne.add(Personne("tata",110.0,1.95, Adresse("28 rue jean jaque","Melun","77000")))
    var tailleMax =lesPersonne.get(0).taille
    var poidMin =lesPersonne.get(0).poids
    val listeMelun = mutableListOf<String>()
    for (unePersonne in lesPersonne){
        cumultaille += unePersonne.taille
        cumulpoids += unePersonne.poids
        if (unePersonne.taille > tailleMax){
            tailleMax = unePersonne.taille
        }
        if (unePersonne.poids< poidMin){
            poidMin = unePersonne.poids
        }
        if (unePersonne.adresse.codePostal == "77000"){
            listeMelun.add(unePersonne.nom)
        }
    }

    println("taille maximale : $tailleMax")
    println("poids le plus bas: $poidMin")
    println("moyenne des tailles: ${cumultaille/lesPersonne.size}")
    println("moyenne des poids: ${cumulpoids/lesPersonne.size}")
    println("habitant de melun : $listeMelun")

}