package com.example.kotlinmvp

import com.squareup.moshi.Moshi

class PersonRepositoryImpl:PersonRepository {
    override fun loadPerson()= Person("John", 250, 84, 58)
}

data class Person(val name:String , val weight:Int, val height:Int, val age:Int) {
}

interface PersonRepository {
    fun loadPerson(): Person
}