import kotlin.math.abs

fun calculateAverage(number1: Double, number2: Double): Double {
    return (number1 + number2) / 2
}

fun calculateDifference(number1: Double, number2: Double): Double {
    return abs(number1 - number2)
}

fun calculateProduct(number1: Double, number2: Double): Double {
    return number1 * number2
}

fun calculateDivision(number1: Double, number2: Double): Double? {
    return if (number2 == 0.0) null else number1 / number2
}

fun main() {}