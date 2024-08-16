package com.betrybe.playground

class Director(name: String, age: Int, email: String, functionId: Int,
               val startTime: String, val endTime: String)
    : Collaborator(name, age, email, functionId) {
    private val sT: String = startTime
    private val eT: String = endTime
}