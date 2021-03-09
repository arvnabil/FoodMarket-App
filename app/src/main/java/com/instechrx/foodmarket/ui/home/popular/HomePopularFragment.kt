package com.instechrx.foodmarket.ui.home.popular

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.instechrx.foodmarket.R
import com.instechrx.foodmarket.model.dummy.HomeVerticalModel
import com.instechrx.foodmarket.ui.detail.DetailActivity
import com.instechrx.foodmarket.ui.home.newtaste.HomeNewTasteAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomePopularFragment : Fragment(), HomeNewTasteAdapter.ItemAdapterCallback {

    private var foodList : ArrayList<HomeVerticalModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_new_taste, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initDataDummy()
        val adapter = HomeNewTasteAdapter(foodList, this)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(activity)
        rvList.layoutManager = layoutManager
        rvList.adapter  = adapter
    }

    private fun initDataDummy() {
        foodList = ArrayList()
        foodList.add(HomeVerticalModel("Cherry Healthy","10000","",5f))
        foodList.add(HomeVerticalModel("Burger Tamayo","50000","",4f))

    }

    override fun onClick(v: View, data: HomeVerticalModel) {
        val detail = Intent(activity, DetailActivity::class.java)
        startActivity(detail)
    }

}