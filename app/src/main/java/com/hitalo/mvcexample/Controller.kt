package com.hitalo.mvcexample

class Controller(_model : Model, _view : View) {
    private val model : Model
    private val view : View
    init {
        model = _model
        view = _view
    }

    fun increment() {
        model.setValue(model.getValue() + 1)
        view.updateValue(model.getValue())
    }

    fun decrement() {
        model.setValue(model.getValue() - 1)
        view.updateValue(model.getValue())
    }
}