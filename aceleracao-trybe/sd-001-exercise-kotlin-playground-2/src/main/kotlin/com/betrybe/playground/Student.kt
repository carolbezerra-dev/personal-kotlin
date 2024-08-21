package com.betrybe.playground

class Student(name: String, age: Int, email: String,
              val enrollmentNumber: Int, val subjects: List<Discipline>, val academicPeriod: PeriodEnum)
    : Person(name, age, email) {
    private val e: Int = enrollmentNumber
    private val s: List<Discipline> = subjects
    private val aP: PeriodEnum = academicPeriod
}