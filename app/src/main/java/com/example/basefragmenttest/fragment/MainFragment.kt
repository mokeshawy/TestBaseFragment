package com.example.basefragmenttest.fragment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.example.basefragmenttest.R
import com.example.basefragmenttest.core.BaseFragment
import com.example.basefragmenttest.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding,MainFragmentViewModel>() {


    override fun getFragmentView()  = R.layout.fragment_main
    override fun getViewModel()     = MainFragmentViewModel::class.java

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lifecycleOwner  = this
        binding.mainFragment    = viewModel

        viewModel.tvHelloTestBaseFragment.value = "Hello Test Fragment"

        binding.helloBaseFragment.setOnClickListener {
            Toast.makeText(requireActivity(),"Hello Test Base Fragment",Toast.LENGTH_SHORT).show()
        }

    }
}