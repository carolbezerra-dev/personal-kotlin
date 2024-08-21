fun calculateConsumerPrice(factoryCost: Double): Double {
    if (factoryCost <= 12000.0) {
        return factoryCost * 1.05
    } else if (factoryCost > 12000.0 && factoryCost < 25000.0) {
        return  factoryCost * 1.25
    } else {
        return factoryCost * 1.35
    }
}

fun main() {
    println(calculateConsumerPrice(10000.0))
    println(calculateConsumerPrice(15000.0))
    println(calculateConsumerPrice(30000.0))
}