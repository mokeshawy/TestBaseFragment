package com.example.basefragmenttest.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainFragmentViewModel : ViewModel(){

    val tvHelloTestBaseFragment = MutableLiveData<String>("")
}