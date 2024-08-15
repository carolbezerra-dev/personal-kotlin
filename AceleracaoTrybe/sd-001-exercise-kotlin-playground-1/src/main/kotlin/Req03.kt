fun calculateYears(birthYear: Int, currentYear: Int): Int {
    return currentYear - birthYear
}

fun calculateMonths(birthYear: Int, currentYear: Int): Int {
    return (currentYear - birthYear) * 12
}

fun calculateDays(birthYear: Int, currentYear: Int): Long {
    val fromYearsToDays = (currentYear - birthYear) * 365.3
    return (fromYearsToDays - 1).toLong()
}

fun calculateWeeks(birthYear: Int, currentYear: Int): Long {
    val fromYearsToDays = (currentYear - birthYear) * 365.2
    return (fromYearsToDays / 7).toLong()
}

fun main() {}