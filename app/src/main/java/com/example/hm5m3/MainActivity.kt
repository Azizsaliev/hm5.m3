package com.example.hm5m3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.graphics.alpha

class MainActivity : AppCompatActivity() {

    private lateinit var textView : TextView
    private lateinit var btn : Button
    private lateinit var btnMinus : Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn)
        btnMinus = findViewById(R.id.btn_)
        textView = findViewById(R.id.txt_count)
        var a = 0
        btn.setOnClickListener() {
            if (textView.text.equals("10")) {
                btn.visibility = View.INVISIBLE
                btnMinus.visibility = View.VISIBLE
            } else {
                a++
                textView.text = a.toString()
            }
        }
            btnMinus.setOnClickListener(){
                if (textView.text.equals("0")){
                    btn.visibility = View.VISIBLE
                    btnMinus.visibility = View.INVISIBLE
                }else{
                    a--
                    textView.text =a.toString()
                }
            }





        }

    }