fun prixTotal(typeVoiture: String,typeCarrbu: String,jours: Int,km: Int,offre: Boolean): Double{
    var prixLoca = when (typeVoiture) {
        "Citadine" -> 80
        "Berline" -> 100
        else -> 130
    }
    prixLoca *= jours
    var prixConso = if (typeCarrbu == "Essence") 1.93 else 1.89
    prixConso *= km
    val total = (if (offre) (prixLoca + prixConso + 30) *0.9 else prixLoca + prixConso)
    return total
}
fun main(){
    println(prixTotal("Citadine", "Diesel", 2, 250, false))
}
