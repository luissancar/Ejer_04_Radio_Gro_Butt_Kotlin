package com.example.luissancar.ejer_04_radio_gro_butt_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {44
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioButton.setChecked(true)
        button.setEnabled(false)
        button.setOnClickListener({ opera() })
        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                activarBoton()
            }

            override fun afterTextChanged(s: Editable) {

            }
        })
        editText2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                activarBoton()
            }

            override fun afterTextChanged(s: Editable) {

            }
        })

    }

    fun opera(){
        val operacion:Int
        if (radioButton.isChecked)
            operacion=editText.text.toString().toInt()-editText2.text.toString().toInt()
        else
            operacion=editText.text.toString().toInt()+editText2.text.toString().toInt()

        textView.text=operacion.toString()

    }

    fun activarBoton(){



        if (editText.text.length>0 && editText2.text.length>0)
            button.setEnabled(true)
        else
            button.setEnabled(false)



    }
}
