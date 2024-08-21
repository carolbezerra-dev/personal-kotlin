package com.betrybe.aula02

/*
Escrevas um programa em Kotlin que receba dois números e mostre o maior.
*/

fun main() {
    println("Digite primeiro número: ")
    val num1 = readln().toInt()

    println("Digite segundo número: ")
    val num2 = readln().toInt()

    print("Entre $num1 e $num2, o maior número é ${devolveMaiorNumero(num1, num2)}")
}

fun devolveMaiorNumero(num1: Int, num2: Int): Int {
    if (num1 > num2) {
        return num1
    } else {
        return num2
    }
}