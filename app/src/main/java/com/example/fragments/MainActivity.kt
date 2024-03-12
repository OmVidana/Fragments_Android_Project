package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcButton = findViewById<Button>(R.id.calc_button)
        val imcButton = findViewById<Button>(R.id.imc_button)

        calcButton.setOnClickListener {
            replaceFragment(Calculator())
        }

        imcButton.setOnClickListener {
            replaceFragment(IMC())
        }
    }

    public fun replaceFragment(fragment: Fragment) {
        val manager = supportFragmentManager
        var transaction = manager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, fragment)
        transaction.commit()
    }
}