package com.example.bookifier


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.testButton);
        var myText = findViewById<TextView>(R.id.outputText);
        var input = findViewById<EditText>(R.id.inputString)

        btn.setOnClickListener()
        {
            myText.text = input.editableText;
        }

    }
}