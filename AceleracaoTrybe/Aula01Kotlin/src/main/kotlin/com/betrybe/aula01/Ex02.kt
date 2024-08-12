package com.betrybe.aula01

/*
    Escreva um programa que receba o salário base de um funcionário,
    calcule e mostre o salário a receber,
    sabendo-se que o funcionário tem gratificação de 5% sobre o salário base
    e paga imposto de 7% também sobre o salário base
*/

fun main() {
    print("Digite o salário base: ")
    val salarioBase = readln().toDouble()

    val gratificacao = calcularGratificacao(salarioBase)
    val imposto = calcularImposto(salarioBase)

    print("O salário líquido é ${(salarioBase - imposto) + gratificacao}")
}

fun calcularGratificacao(salarioBase: Double) = salarioBase * 0.05

fun calcularImposto(salarioBase: Double) = salarioBase * 0.07