package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigation.databinding.FragmentASayfaBinding


class ASayfaFragment : Fragment() {

    private lateinit var aSayfaBinding: FragmentASayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        aSayfaBinding = FragmentASayfaBinding.inflate(inflater,container,false)

        aSayfaBinding.buttonBSayfa.setOnClickListener {it ->
            Navigation.findNavController(it).navigate(R.id.bSayfaGecis)
        }

        return aSayfaBinding.root
    }

}