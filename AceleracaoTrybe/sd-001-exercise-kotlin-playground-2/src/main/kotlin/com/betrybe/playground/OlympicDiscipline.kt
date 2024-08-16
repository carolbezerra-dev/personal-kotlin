package com.betrybe.playground

class OlympicDiscipline(name: String, code: Int) : Discipline(name, code), Olympic {
    override fun extraClasses(): String {
        println("The name of this OlympicDiscipline is $name")
        return ""
    }

    override fun competition(): String {
        println("The code of this OlympicDiscipline is $code")
        return ""
    }

}