package com.example.mycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class activity_calculator : AppCompatActivity() {
    lateinit var buttonadd:Button
    lateinit var buttonmultipy:Button
    lateinit var buttonsubtract: Button
    lateinit var buttondivide: Button
    lateinit var edt_fnum:EditText
    lateinit var edt_snum:EditText
    lateinit var text_answer:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        edt_fnum=findViewById(R.id.edt_fnum)
        edt_snum=findViewById(R.id.edt_snum)
        text_answer=findViewById(R.id.edt_answer)

        buttonadd=findViewById(R.id.btn_plus)
        buttonadd!! .setOnClickListener {
            val firstnum=edt_fnum.text.toString()
            var secondnum=edt_snum.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                text_answer.text="Please fill in all inputs!"
            }else{
                var Answer=firstnum.toDouble() + secondnum.toDouble()
                text_answer.text=Answer.toString()
            }
        }

        buttondivide=findViewById(R.id.btn_division)
        buttondivide!! .setOnClickListener {
            val firstnum=edt_fnum.text.toString()
            var secondnum=edt_snum.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                text_answer.text="Please fill in all inputs!"
            }else{
                var Answer=firstnum.toDouble() / secondnum.toDouble()
                text_answer.text=Answer.toString()
            }
        }
        buttonmultipy=findViewById(R.id.btn_multiply)
        buttonmultipy!! .setOnClickListener {
            val firstnum=edt_fnum.text.toString()
            var secondnum=edt_snum.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                text_answer.text="Please fill in all inputs!"
            }else{
                var Answer=firstnum.toDouble() * secondnum.toDouble()
                text_answer.text=Answer.toString()
            }
        }

        buttonsubtract=findViewById(R.id.btn_minus)
        buttonsubtract!! .setOnClickListener {
            val firstnum=edt_fnum.text.toString()
            var secondnum=edt_snum.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                text_answer.text="Please fill in all inputs!"
            }else{
                var Answer=firstnum.toDouble() - secondnum.toDouble()
                text_answer.text=Answer.toString()
            }
        }


    }
}