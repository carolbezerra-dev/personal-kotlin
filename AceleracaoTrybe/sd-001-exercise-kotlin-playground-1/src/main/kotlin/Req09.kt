fun calculateFinalPrice(carValue: Double, installment: Int, surcharges: Array<Double>): Double {
    var newCarValue = 0.0
    for (surcharge in surcharges) {
        if (((installment / 2) / 100.0) == surcharge) {
            newCarValue = carValue + (carValue * surcharge)
            break
        } else {
            newCarValue = carValue - (carValue * 0.2)
        }
    }
    return newCarValue
}

fun main() {
    println(calculateFinalPrice(25000.0, 1, arrayOf(0.06, 0.12, 0.18, 0.24, 0.30)))
    println(calculateFinalPrice(25000.0, 12, arrayOf(0.06, 0.12, 0.18, 0.24, 0.30)))
    println(calculateFinalPrice(25000.0, 24, arrayOf(0.06, 0.12, 0.18, 0.24, 0.30)))
    println(calculateFinalPrice(25000.0, 36, arrayOf(0.06, 0.12, 0.18, 0.24, 0.30)))
    println(calculateFinalPrice(25000.0, 48, arrayOf(0.06, 0.12, 0.18, 0.24, 0.30)))
    println(calculateFinalPrice(25000.0, 60, arrayOf(0.06, 0.12, 0.18, 0.24, 0.30)))
}