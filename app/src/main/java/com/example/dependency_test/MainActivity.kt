package com.example.dependency_test

import TestDep
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.other.A

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testDep = TestDep()
        val other = A()
    }
}