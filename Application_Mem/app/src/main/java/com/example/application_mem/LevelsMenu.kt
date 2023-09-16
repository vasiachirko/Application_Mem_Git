package com.example.application_mem

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.ImageButton

class LevelsMenu : Activity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        setContentView(R.layout.levels)

        val my_btn1 : ImageButton = findViewById(R.id.lvls_btn1)
        my_btn1.setOnClickListener(this)

        val my_btn2 : ImageButton = findViewById(R.id.lvls_btn2)
        my_btn2.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        if (p0.id == R.id.lvls_btn1) {
            onPause()
            startActivity(Intent(this, Lvls_letter1::class.java))
        } else if (p0.id == R.id.lvls_btn2) {
            onPause()
            startActivity(Intent(this, Lvls_letter2::class.java))
        }

    }


}