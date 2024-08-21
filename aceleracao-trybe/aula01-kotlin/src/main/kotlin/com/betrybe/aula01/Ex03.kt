package com.betrybe.aula01

import kotlin.math.pow

/*
    Escreve um programa que receba altura e peso de uma pessoa,
    calcule e mostre IMC correspondente,
    sabendo-se que o cálculo do IMC é igual ao peso, em kilos, dividido pela altura, em metros, ao quadrado
*/

fun main() {
    print("Digite sua altura em metros: ")
    val altura = readln().toDouble()

    print("Digite seu peso, em kilos: ")
    val peso = readln().toDouble()

    print("Seu IMG é igual a ${calcularIMC(altura, peso)}")
}

fun calcularIMC(altura: Double, peso: Double) = peso / altura.pow(2.0)