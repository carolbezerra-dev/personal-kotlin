fun calculateAverage(ages: List<Int>): Double {
    var sum = 0
    for (age in ages) {
        sum += age
    }
    return (sum / ages.size).toDouble()
}

fun countPeopleWeightHeight(weights: List<Double>, heights: List<Double>): Int {
    var sum = 0
    for (i in weights.indices) {
        if (weights[i] > 90.0 && heights[i] < 1.50) {
            sum += 1
        }
    }
    return sum
}

fun calculatePercentageAgeHeight(ages: List<Int>, heights: List<Double>): Int {
    var sum = 0
    for (i in ages.indices) {
        if ((ages[i] > 10.0 && ages[i] <= 30) && heights[i] > 1.90) {
            sum += 1
        }
    }
    return (100 * sum) / ages.size
}

fun main() {
    println(calculateAverage(listOf(25, 30, 35, 40, 45)))
    println(countPeopleWeightHeight(listOf(80.0, 95.0, 70.0, 100.0, 98.0), listOf(1.95, 1.96, 1.60, 1.96, 1.45)))
    println(calculatePercentageAgeHeight(listOf(25, 30, 35, 40, 45), listOf(1.95, 1.96, 1.60, 1.96, 1.45)))
}