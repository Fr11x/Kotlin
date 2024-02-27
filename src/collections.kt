
fun serie(n : Int): List<Int> {
    val liste = mutableListOf<Int>()
    for (i in 1..n) {
        liste.add(i)
    }
    return liste
}
fun serieInverse(n: Int): List<Int> = serie(n).reversed()
fun listePair(list: List<Int>): List<Int>{
    val pair = mutableListOf<Int>()
    for (nb in list){
        if (nb % 2 == 0) pair.add(nb)
    }
    return pair
}
fun main() {
//    val planetes = arrayOf(
//        "mercure", "Venus", "terre", "Mars", "Jupiter", "saturne",
//        "Uranus", "Neptune"
//    )
//    println(planetes.first())
//    println(planetes.get(0))
//    println(planetes.last())
//    println(planetes.get(7))
//    println(planetes.filter { it.startsWith('m') || it.startsWith('M') })
//    for (planete in planetes){
//        println(planete.lowercase()
//            .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
//    }


//    val entiers = mutableListOf<Int>()
//    val listePair = mutableListOf<Int>()
//    val listImpair = mutableListOf<Int>()
//    for(i in 1..10){
//        entiers.add( (1..100).random())
//    }
//    println(entiers)
//    println(entiers.max())
//    println(entiers.min())
//    for (pair in entiers){
//        if (pair % 2 == 0) listePair.add(pair) else listImpair.add(pair)
//    }
//    println(listePair)
//    println(listImpair)

//    val notes = mutableMapOf<String, MutableList<Int>>("Adrien" to mutableListOf(15,12,
//        10),"Bertrand" to mutableListOf(12,10))
//    notes.getOrPut("Toto") { mutableListOf() }.add(8)// ajoute la clé Toto avec une note de 8
//    notes.getOrPut("Adrien") { mutableListOf() }.add(6)//ajoute une note de 6 à la clé  Adrien
//    for (eleve in notes){
//        println(eleve.key)
//        println(eleve.value)
//        val moyenne = (eleve.value.sum().toDouble()/eleve.value.size)
//        println(moyenne)
//        if (moyenne >= 10) println(eleve.key)
//
//        }
        println(listePair(20,14,15,17))
    }
