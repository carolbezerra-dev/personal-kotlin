fun calculateNewSalary(currentSalary: Double): Double {
    return when (true) {
        (currentSalary <= 300.0) -> currentSalary * 1.5
        (currentSalary > 300.0 && currentSalary <= 500.0) -> currentSalary * 1.4
        (currentSalary > 500.0 && currentSalary <= 700.0) -> currentSalary * 1.3
        (currentSalary > 700.0 && currentSalary <= 800.0) -> currentSalary * 1.2
        (currentSalary > 800.0 && currentSalary <= 1000.0) -> currentSalary * 1.1
        else -> currentSalary * 1.05
    }
}

fun main() {
    println(calculateNewSalary(200.0))
    println(calculateNewSalary(400.0))
    println(calculateNewSalary(600.0))
    println(calculateNewSalary(750.0))
    println(calculateNewSalary(900.0))
    println(calculateNewSalary(1200.0))
}