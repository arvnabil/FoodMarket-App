package com.instechrx.foodmarket.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.instechrx.foodmarket.R
import com.instechrx.foodmarket.model.dummy.HomeModel
import com.instechrx.foodmarket.ui.detail.DetailActivity
import kotlinx.android.synthetic.main.fragment_home.*

open class HomeFragment : Fragment(), HomeAdapter.ItemAdapterCallback{

    private var foodList : ArrayList<HomeModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val root = inflater.inflate(R.layout.fragment_home, container, false)
//        return root
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initDataDummy()
        val adapter = HomeAdapter(foodList, this)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rvList.layoutManager = layoutManager
        rvList.adapter  = adapter

        val sectionPagerAdapter = SectionPagerAdapter(childFragmentManager)
        viewPager.adapter = sectionPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }

     private fun initDataDummy() {
        foodList = ArrayList()
        foodList.add(HomeModel("Cherry Healthy", "", 5f))
        foodList.add(HomeModel("Burger Tamayo", "", 4.5f))
        foodList.add(HomeModel("Bakwan Mantap", "", 3f))
    }

    override fun onClick(v: View, data: HomeModel) {
        val detail = Intent(activity, DetailActivity::class.java)
        startActivity(detail)
    }
}