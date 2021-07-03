package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickedb(view: View) {
        val name = findViewById<EditText>(R.id.nametaker).editableText.toString()
        val intent = Intent(this,SecondAct::class.java)
        intent.putExtra(SecondAct.namer,name)
        startActivity(intent)
//        Toast.makeText(this,"The name is $name",Toast.LENGTH_LONG).show()
    }
}