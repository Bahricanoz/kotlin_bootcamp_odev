package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.example.navigation.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {

    private lateinit var anaSayfaBinding: FragmentAnaSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        anaSayfaBinding = FragmentAnaSayfaBinding.inflate(inflater,container,false)


        anaSayfaBinding.buttonASayfa.setOnClickListener {it ->
            Navigation.findNavController(it).navigate(R.id.aSayfaGecis)
        }

        anaSayfaBinding.buttonXSayfa.setOnClickListener {it ->
            Navigation.findNavController(it).navigate(R.id.xSayfaGecis)
        }

        return anaSayfaBinding.root
    }

}