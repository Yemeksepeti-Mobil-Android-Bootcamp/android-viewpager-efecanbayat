package com.efecanbayat.homework_viewpager.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.efecanbayat.homework_viewpager.fragments.FirstFragment
import com.efecanbayat.homework_viewpager.fragments.FourthFragment
import com.efecanbayat.homework_viewpager.fragments.SecondFragment
import com.efecanbayat.homework_viewpager.fragments.ThirdFragment

private const val PAGE_NUMBER = 3

class ViewPagerAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            else -> FourthFragment()
        }
    }

}