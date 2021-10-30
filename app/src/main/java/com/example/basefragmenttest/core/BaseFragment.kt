package com.example.basefragmenttest.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseFragment< dataBinding : ViewDataBinding , viewModel : ViewModel > : Fragment() {


    protected lateinit var viewModel    : viewModel
    protected lateinit var binding      : dataBinding


    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,getFragmentView(),container,false)

        viewModel = ViewModelProvider(this).get(getViewModel())

        return binding.root


    }

    abstract fun getFragmentView()  : Int
    abstract fun getViewModel()     : Class<viewModel>
}