package com.example.basefragmenttest.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import java.util.*

abstract class BaseFragment< dataBinding : ViewDataBinding , viewModel : ViewModel > : Fragment() {

    protected lateinit var viewModel    : viewModel

    protected lateinit var binding      : dataBinding


    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        viewModel = ViewModelProvider(this).get(getViewModel())

        binding = getFragmentView()

        getLifecycleOwner()

        return binding.root


    }

    /* ---- create base dataBinding ---- */
    abstract fun getFragmentView()  : dataBinding

    /* ---- create base viewModel ---- */
    abstract fun getViewModel()     : Class<viewModel>

    /* ---- create short toast ---- */
    fun getShortToast(message : String){
        Toast.makeText(requireActivity(),message,Toast.LENGTH_SHORT).show()
    }

    /* ---- create long toast ---- */
    fun getLongToast(message : String){
        Toast.makeText(requireActivity(),message,Toast.LENGTH_LONG).show()
    }

    /**
     * get navigate only or with pass any data by bundle
     */
    fun getFindControllerNavigate(action : Int , bundle : Bundle = Bundle()) = findNavController().navigate(action,bundle)

    /* ------ get lifecycle owner ----- */
    fun getLifecycleOwner(){
        binding.lifecycleOwner = this
    }

}