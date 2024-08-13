package com.betrybe.aula02

/*
Escreva um programa em Kotlin que receba três notas de uma pessoa estudante,
mostre a média aritmética e a mensagem de acordo com as regras a seguir:

Média aritmética igual ou maior que 0.0 e menor do que 3.0, exibir a mensagem REPROVADO
Média aritmética igual ou maior que 3.0 e menor do que 7.0, exibir a mensagem EXAME
Média aritmética igual ou maior que 7.0 e menor do que 10.0, exibir a mensagem APROVADO
*/

fun main() {
    println("Qual primeira nota: ")
    val nota1 = readln().toDouble()

    println("Qual segunda nota: ")
    val nota2 = readln().toDouble()

    println("Qual terceira nota: ")
    val nota3 = readln().toDouble()

    val media = calcularMedia(nota1, nota2, nota3)

    println("A média dessas notas é: ${media}, com isso, o resultado final é: ${resultado(media)}")
}

fun calcularMedia(nota1: Double, nota2: Double, nota3: Double) = (nota1 + nota2 + nota3) / 3

fun resultado(media: Double): String {
    return when(true) {
        (media >= 0.0 && media < 3.0) -> "REPROVADO"
        (media >= 3.0 && media < 7.0) -> "EXAME"
        else -> "APROVADO"
    }
}