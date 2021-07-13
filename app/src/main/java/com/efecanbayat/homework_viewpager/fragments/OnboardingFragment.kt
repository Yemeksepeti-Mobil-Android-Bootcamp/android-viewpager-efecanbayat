package com.efecanbayat.homework_viewpager.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.efecanbayat.homework_viewpager.databinding.FragmentOnboardingBinding
import com.efecanbayat.homework_viewpager.utils.DepthTransformation
import com.efecanbayat.homework_viewpager.utils.ViewPagerAdapter

class OnboardingFragment: Fragment() {
    private lateinit var binding: FragmentOnboardingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardingBinding.inflate(inflater,container,false)
        val view = binding.root
        init()
        return view
    }

    private fun init() {
        val adapter = ViewPagerAdapter(requireActivity())
        binding.viewPager.adapter = adapter
        binding.viewPager.setPageTransformer(DepthTransformation())
        binding.dotsIndicator.setViewPager2(binding.viewPager)
    }
}