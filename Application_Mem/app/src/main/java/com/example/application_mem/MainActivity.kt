package com.example.application_mem

import android.annotation.SuppressLint
import android.graphics.Color
import android.media.Image
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity(), View.OnClickListener {
    lateinit var img_left : ImageView
    lateinit var img_right : ImageView
    lateinit var prev_pressed_button : ImageButton
    lateinit var prev_pressed_button2 : ImageButton
    lateinit var prev_pressed_button3 : ImageButton
    var img_left_resourse : Int = 0
    var img_right_resourse : Int = 0

    var pictures_initialize : Boolean = false

    var count_clicks = 0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var my_btn1 : ImageButton = findViewById(R.id.btn1)
        my_btn1.setOnClickListener(this)

        var my_btn2 :ImageButton = findViewById(R.id.btn2)
        my_btn2.setOnClickListener(this)

        var my_btn3 :ImageButton = findViewById(R.id.btn3)
        my_btn3.setOnClickListener(this)

        var my_btn4 :ImageButton = findViewById(R.id.btn4)
        my_btn4.setOnClickListener(this)

        var my_btn5 :ImageButton = findViewById(R.id.btn5)
        my_btn5.setOnClickListener(this)



        img_left = findViewById(R.id.lImg)
        img_right = findViewById(R.id.rImg)
        img_left.setImageResource(R.drawable.tshirt)
        img_right.setImageResource(R.drawable.tshirt)

        prev_pressed_button = my_btn1
        prev_pressed_button2 = my_btn1



        var my_btn6 :ImageButton = findViewById(R.id.btn6)
        my_btn6.setOnClickListener(this)

        var my_btn7 :ImageButton = findViewById(R.id.btn7)
        my_btn7.setOnClickListener(this)

        var my_btn8 :ImageButton = findViewById(R.id.btn8)
        my_btn8.setOnClickListener(this)

        var my_btn9 :ImageButton = findViewById(R.id.btn9)
        my_btn9.setOnClickListener(this)

        var my_btn10 :ImageButton = findViewById(R.id.btn10)
        my_btn10.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        var img_str_resourse = R.drawable.pic1
        var btn_in_func :ImageButton = findViewById(p0.id)
        if (count_clicks < 3) {
            if (p0.id == R.id.btn1) {
                img_str_resourse = R.drawable.pic1

            } else if (p0.id == R.id.btn2) {
                img_str_resourse = R.drawable.pic3

            } else if (p0.id == R.id.btn3) {
                img_str_resourse = R.drawable.pic5

            } else if (p0.id == R.id.btn4) {
                img_str_resourse = R.drawable.pic3

            } else if (p0.id == R.id.btn5) {
                img_str_resourse = R.drawable.pic2

            } else if (p0.id == R.id.btn6) {
                img_str_resourse = R.drawable.pic2

            } else if (p0.id == R.id.btn7) {
                img_str_resourse = R.drawable.pic4

            } else if (p0.id == R.id.btn8) {
                img_str_resourse = R.drawable.pic4

            } else if (p0.id == R.id.btn9) {
                img_str_resourse = R.drawable.pic5

            } else if (p0.id == R.id.btn10) {
                img_str_resourse = R.drawable.pic1

            }
        }


        if (!pictures_initialize){
            var btn_init_1 :ImageButton = findViewById(R.id.btn1)
            btn_init_1.setImageResource(R.drawable.tshirt)
            btn_init_1.scaleType = ImageView.ScaleType.CENTER_CROP

            var btn_init_2 :ImageButton = findViewById(R.id.btn2)
            btn_init_2.setImageResource(R.drawable.tshirt)
            btn_init_2.scaleType = ImageView.ScaleType.CENTER_CROP

            var btn_init_3 :ImageButton = findViewById(R.id.btn3)
            btn_init_3.setImageResource(R.drawable.tshirt)
            btn_init_3.scaleType = ImageView.ScaleType.CENTER_CROP

            var btn_init_4 :ImageButton = findViewById(R.id.btn4)
            btn_init_4.setImageResource(R.drawable.tshirt)
            btn_init_4.scaleType = ImageView.ScaleType.CENTER_CROP

            var btn_init_5 :ImageButton = findViewById(R.id.btn5)
            btn_init_5.setImageResource(R.drawable.tshirt)
            btn_init_5.scaleType = ImageView.ScaleType.CENTER_CROP

            var btn_init_6 :ImageButton = findViewById(R.id.btn6)
            btn_init_6.setImageResource(R.drawable.tshirt)
            btn_init_6.scaleType = ImageView.ScaleType.CENTER_CROP

            var btn_init_7 :ImageButton = findViewById(R.id.btn7)
            btn_init_7.setImageResource(R.drawable.tshirt)
            btn_init_7.scaleType = ImageView.ScaleType.CENTER_CROP

            var btn_init_8 :ImageButton = findViewById(R.id.btn8)
            btn_init_8.setImageResource(R.drawable.tshirt)
            btn_init_8.scaleType = ImageView.ScaleType.CENTER_CROP

            var btn_init_9 :ImageButton = findViewById(R.id.btn9)
            btn_init_9.setImageResource(R.drawable.tshirt)
            btn_init_9.scaleType = ImageView.ScaleType.CENTER_CROP

            var btn_init_10 :ImageButton = findViewById(R.id.btn10)
            btn_init_10.setImageResource(R.drawable.tshirt)

            pictures_initialize = true
        }

        if (count_clicks == 1) {
            img_left.setImageResource(img_str_resourse)
            img_left_resourse = img_str_resourse

            prev_pressed_button2 = prev_pressed_button
            prev_pressed_button = btn_in_func

            btn_in_func.setImageResource(R.drawable.button_image1)

        } else if (count_clicks == 2) {
            if (prev_pressed_button.id != btn_in_func.id) {
                img_right.setImageResource(img_str_resourse)
                img_right_resourse = img_str_resourse

                btn_in_func.setImageResource(R.drawable.pic3)
                if (img_right_resourse == img_left_resourse) {
                    prev_pressed_button2 = prev_pressed_button
                    prev_pressed_button = btn_in_func

                    prev_pressed_button.visibility = View.INVISIBLE
                    prev_pressed_button2.visibility = View.INVISIBLE

                    img_left.setImageResource(R.drawable.tshirt)
                    img_right.setImageResource(R.drawable.tshirt)
                    count_clicks = 0
                }
                prev_pressed_button2 = prev_pressed_button
                prev_pressed_button = btn_in_func
                btn_in_func.setImageResource(R.drawable.button_image1)
            }
        } else if (count_clicks == 3) {
            count_clicks = 0

            prev_pressed_button2.setImageResource(R.drawable.tshirt)
            prev_pressed_button.setImageResource(R.drawable.tshirt)
            img_left.setImageResource(R.drawable.tshirt)
            img_right.setImageResource(R.drawable.tshirt)
        }

        count_clicks++


    }
}