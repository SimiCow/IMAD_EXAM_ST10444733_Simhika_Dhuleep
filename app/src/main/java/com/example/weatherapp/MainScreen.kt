package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        var detailedViewButton = findViewById<Button>(R.id.detailedViewBtn)
        var exitBtn = findViewById<Button>(R.id.exitBtn)
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
        var aveTempTV = findViewById<TextView>(R.id.weekAverageTV)
        var aveTemp = 0
        var daysArr = arrayOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
        var minArr = arrayOf<Int>(12,15,16,15,11,10,10)
        var maxArr = arrayOf<Int>(25,29,30,28,24,18,16)
        var count = 0

        //assign values to text views
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


        detailedViewButton.setOnClickListener {
            val intent2 = Intent(this, DetailedView::class.java)
            startActivity(intent2)
        }

        while (count < 7)
        {
            aveTemp
            aveTemp = minArr[count]+maxArr[count]
            aveTemp += aveTemp
            count++
        }
        aveTemp = aveTemp/2
        aveTempTV.text = aveTemp.toString() //working for average temp


        exitBtn.setOnClickListener {
            finish()
        }

    }

}