package com.example.alertdialogusingkotlin

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Are you sure!")
        builder.setMessage("Do you want to close this app?")
        builder.setPositiveButton("Yes", {dialog: DialogInterface?, which: Int -> finish()})
        builder.setNegativeButton("No", {dialog: DialogInterface?, which: Int ->   })
        builder.show()
    }
}
