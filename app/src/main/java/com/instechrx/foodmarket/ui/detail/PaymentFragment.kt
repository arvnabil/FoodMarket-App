package com.instechrx.foodmarket.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.instechrx.foodmarket.R
import kotlinx.android.synthetic.main.fragment_payment.*

class PaymentFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_payment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (activity as DetailActivity).toolbarPayment()

        btnCheckout.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_payment_success)
        }

    }


}