package com.betrybe.playground

class Teacher(name: String, age: Int, email: String, functionId: Int,
              val subjects: List<Discipline>, val period: PeriodEnum)
    : Collaborator(name, age, email, functionId ) {
    private val s: List<Discipline> = subjects
    private val p:  PeriodEnum = period
}