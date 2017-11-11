package com.example.muhammed.myapplication8

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView
    lateinit var radioGroup : RadioGroup
    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textView = findViewById(R.id.textView1)
        radioGroup = findViewById(R.id.radioGroup1)
        btn = findViewById(R.id.button)

        btn.setOnClickListener {
            var value = radioGroup.checkedRadioButtonId
            var rb = findViewById<RadioButton>(value)
            textView.text = rb.text
            Toast.makeText(this,"your gender is : "+rb.text,Toast.LENGTH_LONG).show()
        }
    }
}
