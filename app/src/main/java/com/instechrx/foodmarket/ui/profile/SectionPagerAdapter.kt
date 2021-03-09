package com.instechrx.foodmarket.ui.profile

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.instechrx.foodmarket.ui.profile.account.ProfileAccountFragment
import com.instechrx.foodmarket.ui.profile.foodmarket.ProfileFoodmarketFragment

class SectionPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence {
        return when(position) {
            0 -> "Account"
            1 -> "FoodMarket"
            else -> ""
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        val fragment : Fragment
        return when(position) {
            0 -> {
                fragment = ProfileAccountFragment()
                fragment
            }
            1 -> {
                fragment = ProfileFoodmarketFragment()
                fragment
            }
            else -> {
                fragment = ProfileAccountFragment()
                fragment
            }
        }
    }
}