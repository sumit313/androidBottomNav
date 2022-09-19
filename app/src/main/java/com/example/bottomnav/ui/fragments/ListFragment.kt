package com.example.bottomnav.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.bottomnav.databinding.FragmentListBinding
import com.example.bottomnav.viewModels.MainActivityViewModel

class ListFragment : Fragment(){

    lateinit var binding: FragmentListBinding
    val viewModel : MainActivityViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentListBinding.inflate(layoutInflater)
        viewModel.value = 30
        binding.tvTitle.text = "FragmentList ${viewModel.value}"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
}