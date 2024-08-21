fun countNegativeNumbers(numbers: List<Double>): Int {
    var count = 0
    for (number in numbers) {
        if (number < 0) {
            count += 1
        }
    }
    return count
}

fun calculateSumOfPositiveNumbers(numbers: List<Double>): Double {
    var sum = 0.0
    for (number in numbers) {
        if (number > 0){
            sum += number
        }
    }
    return sum
}

fun main() {
    println(countNegativeNumbers(listOf(-1.0, 2.0, -3.0, 4.0, -5.0)))
    println(calculateSumOfPositiveNumbers(listOf(-1.0, 2.0, -3.0, 4.0, -5.0)))
}