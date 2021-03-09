package com.instechrx.foodmarket.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.instechrx.foodmarket.R
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val sectionPagerAdapter = SectionPagerAdapter(
            childFragmentManager
        )
        viewPager.adapter = sectionPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
//
//        val user = FoodMarket.getApp().getUser()
//        val userResponse = Gson().fromJson(user, User::class.java)
//
//        tvName.setText(userResponse.name)
//        tvEmail.setText(userResponse.email)
//
//        if (!userResponse.profile_photo_url.isNullOrEmpty()){
//            Glide.with(requireActivity())
//                .load(userResponse.profile_photo_url)
//                .apply(RequestOptions.circleCropTransform())
//                .into(ivPicture)
//        }
    }
}