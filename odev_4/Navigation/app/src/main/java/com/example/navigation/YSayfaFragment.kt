package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.navigation.databinding.FragmentYSayfaBinding
import com.google.android.material.snackbar.Snackbar

class YSayfaFragment : Fragment() {

    private lateinit var ySayfaBinding: FragmentYSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        ySayfaBinding = FragmentYSayfaBinding.inflate(inflater,container,false)
        
        val backPress = object : OnBackPressedCallback(enabled = true) {
            override fun handleOnBackPressed() {
                findNavController().popBackStack(R.id.anaSayfaFragment,false)
                // ilk parametre geri dönülmek istenilen frgamnet, ikinic parametere hedef fragmenta geri dön stackten çıkarma
            }
            
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backPress)
        return ySayfaBinding.root
    }


}