package com.hitalo.mvcexample

class Model {
    private var number : Int
    init {
        number = 0
    }

    fun setValue(n : Int) {
        number = n
    }

    fun getValue(): Int {
        return number
    }
}