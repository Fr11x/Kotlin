fun bonjour(name: String): String = "bonjour $name"

fun entiers(ent1: Int, ent2: Int): String ="somme = ${ent1+ent2}, difference = ${ent1-ent2} " +
        "multiplication = ${ent1*ent2}, division = ${ent1/ent2}"
fun tarifReduit(age: Int): String = if (age <26) "droit au tarif reduit" else "pas droit au tarif"
fun produit(ent1: Int, ent2: Int): String = if ((ent1 >0 && ent2 >0) || (ent1 <0 && ent2 <0))  "positif" else  "negatif"
fun bissextile(annee: Int): Boolean = (annee % 4 ==0 && annee % 100 != 0) || annee % 400 == 0
fun compteur(max: Int){ for (i in 1..max) println(i)}
/* var i: Int = 1
 while (i <= max) {  }
     println(i)
     i++
 }*/

fun pairImpair(ent: Int) {
    print( if (ent % 2 == 0) "nombre pair > " else "nombre impaire > ")
    for (i in ent..ent+18 step 2) {
        print("-$i")
    }
}
fun mutliple(start: Int, end: Int){for (i in start..end step start)if (i <=end) println(i)}


fun main() {
    //println(bonjour("jean"))
    //println(entiers(5,5))
    //println(tarifReduit(35))
//    println(produit(-2,2))
//  println(pairImpair(9))
    var prixTaille = 0.0
}