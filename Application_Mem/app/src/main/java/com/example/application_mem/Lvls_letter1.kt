package com.example.application_mem

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class Lvls_letter1 : Activity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        setContentView(R.layout.levels_for_letter1)

        var my_btn1 : Button = findViewById(R.id.lvls_letter1_btn1)
        my_btn1.setOnClickListener(this)

        var my_btn2 : Button = findViewById(R.id.lvls_letter1_btn2)
        my_btn2.setOnClickListener(this)

        var my_btn3 : Button = findViewById(R.id.lvls_letter1_btn3)
        my_btn3.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        if (p0.id == R.id.lvls_letter1_btn1) {
            onPause()
            startActivity(Intent(this, Level1::class.java))
        } else if (p0.id == R.id.lvls_letter1_btn2) {
            onPause()
            startActivity(Intent(this, Level2::class.java))
        }else if (p0.id == R.id.lvls_letter1_btn3) {
            onPause()
            startActivity(Intent(this, Level3::class.java))
        }
    }


}