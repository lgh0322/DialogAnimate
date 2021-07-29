package com.vaca.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.WindowManager
import android.widget.TextView
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gaga:TextView=findViewById(R.id.fuck)
        gaga.setOnClickListener {
            Ca.customDialog(this,R.layout.dialog,R.style.showDialog,Gravity.LEFT,WindowManager.LayoutParams.WRAP_CONTENT,WindowManager.LayoutParams.WRAP_CONTENT,R.style.AnimLeft)
            MainScope().launch {
                delay(5000)
                Ca.fuck()
            }
        }
    }
}