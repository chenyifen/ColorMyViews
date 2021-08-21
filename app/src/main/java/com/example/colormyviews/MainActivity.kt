package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickableViews: List<View> =
                listOf(box_one, box_two, box_three,
                        box_four, box_five)

        //TODO
        box_one.setOnClickListener { makeColored(it) }
        box_two.setOnClickListener { makeColored(it) }
        box_three.setOnClickListener { makeColored(it) }
        box_four.setOnClickListener { makeColored(it) }
        box_five.setOnClickListener { makeColored(it) }



    }

    fun makeColored(view: View){
        Log.i("chenyifen","view clicked")
        when(view.id){
            R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three -> view.setBackgroundColor(Color.GREEN)
            R.id.box_four -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_five -> view.setBackgroundColor(Color.BLUE)
            else -> view.setBackgroundColor(Color.LTGRAY)

        }
    }
}