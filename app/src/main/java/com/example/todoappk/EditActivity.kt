package com.example.todoappk

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        val activity = intent.getStringExtra("activity").toString()
        val view = findViewById<EditText>(R.id.editText)
        view.setText(activity)

        findViewById<Button>(R.id.button2).setOnClickListener {
            intent.putExtra("activity", view.text.toString())
            setResult(Activity.RESULT_OK, intent)
            this.finish()
        }

    }


}