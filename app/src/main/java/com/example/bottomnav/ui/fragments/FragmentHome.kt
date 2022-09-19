package com.example.bottomnav.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.bottomnav.databinding.FragmentHomeBinding
import com.example.bottomnav.viewModels.MainActivityViewModel

class FragmentHome: Fragment() {

    lateinit var binding: FragmentHomeBinding
    val viewModel : MainActivityViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentHomeBinding.inflate(layoutInflater)
        viewModel.value = 10
        binding.tvTitle.text = "FragmentHome ${viewModel.value}"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
}