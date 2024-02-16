fun salaire(capf: Int,capi: Int,jours: Int): Double {
    val salaireFixe = 900
    val repas = 9 * jours
    val ca = if (capf <= 1500) {
        capf * 0.05
    } else {
        capf * 0.07
    }
    val ci = if (capi <=1000){
        capi *  0.03
    } else if (capi <= 1800){
        1000 * 0.03 + (capi - 1000) *  0.04
    } else {
        1000 * 0.03 + (800 * 0.04) +  (capi -1800) * 0.05
    }
    val res = (salaireFixe + repas + ca + ci)
    return res
}



fun main(){
    val salary = salaire(1500, 1200, 5)
    println("Total salary: $salary")
}