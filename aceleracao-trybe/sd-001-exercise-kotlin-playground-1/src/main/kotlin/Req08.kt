fun calculateSumEven(numbers: List<Int>): Int {
    var sum = 0
    for (number in numbers) {
        if (number % 2 == 0) {
            sum += number
        }
    }
    return sum
}

fun calculateSumOdd(numbers: List<Int>): Int {
    var sum = 0
    for (number in numbers) {
        if (number % 2 == 1) {
            sum += number
        }
    }
    return sum
}

fun main() {
    println(calculateSumEven(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
    println(calculateSumOdd(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
}