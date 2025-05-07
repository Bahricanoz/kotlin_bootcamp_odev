package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigation.databinding.FragmentXSayfaBinding


class XSayfaFragment : Fragment() {

    private lateinit var xSayfaBinding: FragmentXSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        xSayfaBinding = FragmentXSayfaBinding.inflate(inflater,container,false)

        xSayfaBinding.buttonYSayfa2.setOnClickListener {it->
            Navigation.findNavController(it).navigate(R.id.ySayfaGecis2)
        }
        return xSayfaBinding.root
    }

}