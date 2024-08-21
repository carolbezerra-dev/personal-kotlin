fun findMultiplesOf2(numbers: IntArray): List<Int> {
    val result = mutableListOf<Int>()
    for (number in numbers) {
        if (number % 2 == 0) {
            result.add(number)
        }
    }
    return result
}

fun findMultiplesOf3(numbers: IntArray): List<Int> {
    val result = mutableListOf<Int>()
    for (number in numbers) {
        if (number % 3 == 0) {
            result.add(number)
        }
    }
    return result
}

fun findMultiplesOf2And3(numbers: IntArray): List<Int> {
    val result = mutableListOf<Int>()
    for (number in numbers) {
        if (number % 2 == 0 && number % 3 == 0) {
            result.add(number)
        }
    }
    return result
}

fun main() {
    println(findMultiplesOf2(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)))
    println(findMultiplesOf3(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)))
    println(findMultiplesOf2And3(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)))
}
