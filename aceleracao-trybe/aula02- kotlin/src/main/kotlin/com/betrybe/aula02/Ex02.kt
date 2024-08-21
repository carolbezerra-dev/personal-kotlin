package com.betrybe.aula02

/*
    Cada degrau de uma escada tem X de altura.
    Escreva um programa usando Kotlin que receba essa altura e a altura que uma pessoa deseja alcançar usando a escada,
    calcule e mostre quantos degraus ela deverá subir para atingir seu objetivo, sem se preocupar com a altura da pessoa.
    Todas as medidas fornecidas devem estar em metros.
*/

fun main() {
    println("Qual a altura do degrau? ")
    val degrau = readln().toInt()

    println("Qual altura você quer alcançar? ")
    val objetivo = readln().toInt()

    print("Para alcançar $objetivo metros, é preciso subir ${calcularQuantosDegraus(objetivo, degrau)} degraus")
}

fun calcularQuantosDegraus(objetivo: Int, alturaDegrau: Int) = objetivo / alturaDegrau