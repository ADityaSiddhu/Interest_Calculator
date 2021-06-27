 package com.example.interestcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val amount : EditText = findViewById(R.id.etAmount)

        val interest : EditText = findViewById(R.id.etInterest)

        var loan : TextView = findViewById(R.id.tvLoanamt)

        val time : EditText = findViewById(R.id.etTime)

        val calculate : Button = findViewById(R.id.btnCalculate)

        val refresh :  Button = findViewById(R.id.btnRefresh)


        calculate.setOnClickListener{

            val p = amount.text.toString().toInt()
            val r = interest.text.toString().toInt()
            val t = time.text.toString().toInt()
            val f = (p*r*t)/100
            val T = f+p
            loan.text = T.toString()

        }

        refresh.setOnClickListener{

            amount.setText("")
            interest.setText("")
            time.setText("")
            loan.setText("")


        }






    }
}