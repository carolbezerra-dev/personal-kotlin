package com.betrybe.aula03

/*
    Escreva um programa que preencha 2 arrays de dez elementos numéricos cada um
    e mostre o array resultante da intercalação deles
*/

fun main() {
    val array1 = Array(10) { 0 }
    println(array1.joinToString())
    println("--------------------------")
    val array2 = Array(10) { 1 }
    println(array2.joinToString())
    println("--------------------------")
    var resultante = Array(20) { 2 }
    println(resultante.joinToString())
    println("--------------------------")

    for (i in resultante.indices) {
        if (i % 2 == 0) {
            resultante[i] = array1[0]
        } else {
            resultante[i] = array2[0]
        }
    }

    println(resultante.joinToString())
    println("--------------------------")
}