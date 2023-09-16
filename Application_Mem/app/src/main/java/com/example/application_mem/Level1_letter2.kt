package com.example.application_mem

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Level1_letter2 : Activity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.letter2_lvl1)
    }

    lateinit var img_left : ImageView
    lateinit var img_right : ImageView

    override fun onStart() {
        super.onStart()
        setContentView(R.layout.letter2_lvl1)
        img_left = findViewById(R.id.let2_lvl1_imgLeft)
        img_right = findViewById(R.id.let2_lvl1_imgRight)
        img_left.setImageResource(R.drawable.tshirt2)
        img_right.setImageResource(R.drawable.tshirt2)
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

}