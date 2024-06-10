package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailedView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        var returnToMainBtn = findViewById<Button>(R.id.returnBtn)
        var con1TV = findViewById<TextView>(R.id.con1TV)
        var con2TV = findViewById<TextView>(R.id.con2TV)
        var con3TV = findViewById<TextView>(R.id.con3TV)
        var con4TV = findViewById<TextView>(R.id.con4TV)
        var con5TV = findViewById<TextView>(R.id.con5TV)
        var con6TV = findViewById<TextView>(R.id.con6TV)
        var con7TV = findViewById<TextView>(R.id.con7TV)
        var min1 = findViewById<TextView>(R.id.min1TV)
        var min2 = findViewById<TextView>(R.id.min2TV)
        var min3 = findViewById<TextView>(R.id.min3TV)
        var min4 = findViewById<TextView>(R.id.min4TV)
        var min5 = findViewById<TextView>(R.id.min5TV)
        var min6 = findViewById<TextView>(R.id.min6TV)
        var min7 = findViewById<TextView>(R.id.min7TV)
        var max1 = findViewById<TextView>(R.id.max1TV)
        var max2 = findViewById<TextView>(R.id.max2TV)
        var max3 = findViewById<TextView>(R.id.max3TV)
        var max4 = findViewById<TextView>(R.id.max4TV)
        var max5 = findViewById<TextView>(R.id.max5TV)
        var max6 = findViewById<TextView>(R.id.max6TV)
        var max7 = findViewById<TextView>(R.id.max7TV)
        var con1 = ""
        var con2 = ""
        var con3 = ""
        var con4 = ""
        var con5 = ""
        var con6 = ""
        var con7 = ""
        var daysArr = arrayOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
        var minArr = arrayOf<Int>(12,15,16,15,11,10,10)
        var maxArr = arrayOf<Int>(25,29,30,28,24,18,16)
        var conArr = arrayOf<String>(con1,con2,con3,con4,con5,con6,con7)
        var count = 0
        var count2 = 0
        min1.text = minArr[0].toString()
        min2.text = minArr[1].toString()
        min3.text = minArr[2].toString()
        min4.text = minArr[3].toString()
        min5.text = minArr[4].toString()
        min6.text = minArr[5].toString()
        min7.text = minArr[6].toString()
        max1.text = maxArr[0].toString()
        max2.text = maxArr[1].toString()
        max3.text = maxArr[2].toString()
        max4.text = maxArr[3].toString()
        max5.text = maxArr[4].toString()
        max6.text = maxArr[5].toString()
        max7.text = maxArr[6].toString()

        returnToMainBtn.setOnClickListener {
            val intent3 = Intent(this, MainScreen::class.java)
            startActivity(intent3)
        }

        while (count < 7)
        {
            if (maxArr[count] < 17)
            {
                conArr[count] = "Rainy"
            }
            else if (maxArr[count] < 24)
            {
                conArr[count] = "Cloudy"
            }
            else
            {
                conArr[count] = "Sunny"
            }
            count++
        }// loop to set condition

        //assign conditions
        con1TV.text = conArr[0].toString()
        con2TV.text = conArr[1].toString()
        con3TV.text = conArr[2].toString()
        con4TV.text = conArr[3].toString()
        con5TV.text = conArr[4].toString()
        con6TV.text = conArr[5].toString()
        con7TV.text = conArr[6].toString()

    }
}