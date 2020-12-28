package com.example.kotlinmvp

interface PersonContract {
    interface Presenter : BasePresenter {
        fun onViewCreated()
        fun onLoadPerson()
    }

    interface View : PersonView<PersonContract.Presenter> {
        fun choosePerson(personGender :PersonGender)
    }
}


interface BasePresenter{
    fun onDestroy()
}

interface PersonView<T> {
    fun setPresenter(presenter : T)
}

enum class PersonGender { MAN, WOMAN }