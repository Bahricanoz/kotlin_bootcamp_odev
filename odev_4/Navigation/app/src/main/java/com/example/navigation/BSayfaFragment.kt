package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigation.databinding.FragmentBSayfaBinding


class BSayfaFragment : Fragment() {

    private lateinit var bSayfaBinding: FragmentBSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bSayfaBinding = FragmentBSayfaBinding.inflate(inflater,container,false)

        bSayfaBinding.buttonYSayfa.setOnClickListener {it->
            Navigation.findNavController(it).navigate(R.id.ySayfaGecis)
        }

        return bSayfaBinding.root
    }

}