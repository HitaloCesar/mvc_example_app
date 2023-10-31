package com.hitalo.mvcexample

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class View(context : Context, attrs : AttributeSet) : AppCompatTextView(context, attrs) {
    init {
        textSize = 200f
        text = "0"
    }

    fun updateValue(number : Int) {
        text = number.toString()
    }
}