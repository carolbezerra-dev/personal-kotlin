package com.betrybe.aula01

/*
    Escrever um programa que receba 3 números inteiros,
    calcule e mostre a média aritmétrica simples entre os números.
*/

fun main() {
    print("Digite o primeiro número: ")
    val num1: Int = readln().toInt()

    print("Digite o segundo número: ")
    val num2: Int = readln().toInt()

    print("Digite o terceiro número: ")
    val num3: Int = readln().toInt()

    println("$num1 $num2 $num3")

    print("A média é ${calcularMedia(num1, num2, num3)}")
}

//fun calcularMedia(a: Int, b: Int, c: Int): Int {
//    return (a + b + c) / 3
//}

// como é uma função de 1 linha, pode colocar direto
// tipo de retorno é subentendido
fun calcularMedia(a: Int, b: Int, c: Int) = (a + b + c) / 3