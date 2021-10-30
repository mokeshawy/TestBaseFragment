package com.example.basefragmenttest.fragment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import com.example.basefragmenttest.R
import com.example.basefragmenttest.core.BaseFragment
import com.example.basefragmenttest.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding,MainFragmentViewModel >() {


    override fun getFragmentView()  = FragmentMainBinding.inflate(layoutInflater)
    override fun getViewModel()     = MainFragmentViewModel::class.java

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mainFragment    = viewModel

        viewModel.tvHelloTestBaseFragment.value = "Hello Test Fragment"

        binding.helloBaseFragment.setOnClickListener {
            getShortToast("Hello Test Base Fragment")
        }
    }
}