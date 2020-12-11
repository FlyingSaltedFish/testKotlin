package com.example.testkotlin.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MyViewModel(private val savedStateHandle: SavedStateHandle ): ViewModel() {

   private val _number:MutableLiveData<Int> by lazy {

       if(!savedStateHandle.contains("number")){
           savedStateHandle.set("number",0)
       }
        MutableLiveData<Int>().also { it.value=savedStateHandle.get("number") }
    }
    val number:LiveData<Int>
        get() =_number

    fun modifytNumber(aNumber:Int){
        _number.value=number.value?.plus(aNumber)
        savedStateHandle.set("number",_number.value)
    }

}