package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondAct : AppCompatActivity() {
    companion object{
        const val namer = "ExtraName"
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val name = intent.getStringExtra(namer)
        val textViewer = findViewById<TextView>(R.id.textView)
        textViewer.text = "Happy BirthDay \n $name"
//        textViewer.setText("Happy BirthDay $name")
    }
}