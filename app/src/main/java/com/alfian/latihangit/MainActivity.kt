package com.alfian.latihangit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val vi = View(this)



        Log.d("aaa", "onCreate: abc")

        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show()

        Toast.makeText(this, "hello", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "hello", Toast.LENGTH_LONG).show()
    }

}