package com.example.testkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.activity.viewModels
import androidx.lifecycle.Observer

import com.example.testkotlin.ViewModel.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val viewModel:MyViewModel by viewModels<MyViewModel>()

        viewModel.number.observe(this, Observer { textView.text= it.toString()})

        button.setOnClickListener(){
            viewModel.modifytNumber(-1)
        }
        button2.setOnClickListener(){
            viewModel.modifytNumber(1)
        }

        //add test and add button
        
        //test from GitHub

    }





}
