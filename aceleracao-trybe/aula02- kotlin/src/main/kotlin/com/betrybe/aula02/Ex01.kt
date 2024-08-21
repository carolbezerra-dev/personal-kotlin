package com.betrybe.aula02

/*
    Escreva um programa usando Kotlin que receba o salário de uma pessoa colaboradora,
    calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%
*/

fun main() {
    println("Escreva um valor de salário: ")
    val salario = readln().toInt()

    println("Esse é o valor somado a 25%: ${salarioPlus25Porcento(salario)}")
}

fun salarioPlus25Porcento(salario: Int) = (salario * 0.25) + salario