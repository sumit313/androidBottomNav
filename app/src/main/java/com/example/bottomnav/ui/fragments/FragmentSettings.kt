package com.example.bottomnav.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.bottomnav.databinding.FragmentSettingsBinding
import com.example.bottomnav.viewModels.MainActivityViewModel

class FragmentSettings : Fragment(){
    lateinit var binding: FragmentSettingsBinding
    val viewModel : MainActivityViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentSettingsBinding.inflate(layoutInflater)
        //viewModel.value = 20
        binding.tvTitle.text = "FragmentSettings ${viewModel.value}"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
}