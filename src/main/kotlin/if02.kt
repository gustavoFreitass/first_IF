fun main() {
    println(bonus("Engenheiro de Software"))
    println(bonusXPTO("Gerente", expe = 3))
    println(bonusXPTO("Gerente", expe = 1))
}

fun bonusXPTO(cargo: String, expe: Int): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        bonus = 2000f
        if (expe > 2) {
            bonus = 3000f
        }
    } else if (cargo == "Coordenador") {
        if (expe > 1) {
            bonus = 1800f
        }
        bonus = 1500f
    } else if (cargo == "Engenheiro de Software") {
        bonus = 1000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }
    return bonus
}

fun bonus(cargo: String): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        bonus = 2000f
    } else if (cargo == "Coordenador") {
        bonus = 1500f
    } else if (cargo == "Engenheiro de Software") {
        bonus = 1000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }
    return bonus
}

