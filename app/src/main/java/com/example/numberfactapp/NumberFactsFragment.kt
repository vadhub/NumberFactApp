package com.example.numberfactapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.numberfactapp.databinding.FragmentNumberFactsBinding

class NumberFactsFragment : Fragment() {

    private lateinit var binding: FragmentNumberFactsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNumberFactsBinding.inflate(inflater, container, false)
        return binding.root
    }
}