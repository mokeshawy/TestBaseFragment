package com.example.basefragmenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.basefragmenttest.core.BaseFragment
import com.example.basefragmenttest.databinding.FragmentSecondBinding

class SecondFragment : BaseFragment<FragmentSecondBinding,SecondFragmentViewModel>() {

    override fun getFragmentView() = FragmentSecondBinding.inflate(layoutInflater)

    override fun getViewModel() = SecondFragmentViewModel::class.java

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}