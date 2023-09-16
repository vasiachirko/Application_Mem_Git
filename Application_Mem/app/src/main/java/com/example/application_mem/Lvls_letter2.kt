package com.example.application_mem

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class Lvls_letter2 : Activity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        setContentView(R.layout.levels_for_letter2)

        val my_btn1 : Button = findViewById(R.id.lvls_letter2_btn1)
        my_btn1.setOnClickListener(this)

        val my_btn2 : Button = findViewById(R.id.lvls_letter2_btn2)
        my_btn2.setOnClickListener(this)

        val my_btn3 : Button = findViewById(R.id.lvls_letter2_btn3)
        my_btn3.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        if (p0.id == R.id.lvls_letter2_btn1) {
            onPause()
            startActivity(Intent(this, Level1_letter2::class.java))
        } else if (p0.id == R.id.lvls_letter2_btn2) {
            onPause()
            startActivity(Intent(this, Level2_letter2::class.java))
        }else if (p0.id == R.id.lvls_letter2_btn3) {
            onPause()
            startActivity(Intent(this, Level3_letter2::class.java))
        }
    }


}