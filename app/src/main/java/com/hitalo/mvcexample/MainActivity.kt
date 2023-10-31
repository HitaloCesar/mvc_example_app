package com.hitalo.mvcexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = Model()
        val view = findViewById<View>(R.id.counter)
        val controller = Controller(model, view)

        val decrementButton = findViewById<Button>(R.id.button_minus)
        val incrementButton = findViewById<Button>(R.id.button_plus)

        decrementButton.setOnClickListener {
            controller.decrement()
        }

        incrementButton.setOnClickListener {
            controller.increment()
        }
    }
}