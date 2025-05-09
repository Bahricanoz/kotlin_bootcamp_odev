package com.example.hesapmakinesi

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    val numberList = ArrayList<Int>()
    var deger = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.buttonSayi1.setOnClickListener {
            yazdir("1")
        }

        mainBinding.buttonSayi2.setOnClickListener {
            yazdir("2")
        }

        mainBinding.buttonSayi3.setOnClickListener {
            yazdir("3")
        }

        mainBinding.buttonSayi4.setOnClickListener {
            yazdir("4")
        }

        mainBinding.buttonsayi5.setOnClickListener {
           yazdir("5")
        }

        mainBinding.buttonSayi6.setOnClickListener {
            yazdir("6")
        }

        mainBinding.buttonSayi7.setOnClickListener {
            yazdir("7")
        }

        mainBinding.buttonSayi8.setOnClickListener {
            yazdir("8")
        }

        mainBinding.buttonSayi9.setOnClickListener {
            yazdir("9")
        }

        mainBinding.buttonSifirla.setOnClickListener {
            deger =""
            mainBinding.textViewSonuc.text = "0"
            mainBinding.textViewHafiza.text = ""
            numberList.clear()
        }

        mainBinding.butonArti.setOnClickListener {
            if(deger !=""){
                numberList.add(deger.toInt())
                deger = ""
                mainBinding.textViewHafiza.text = mainBinding.textViewHafiza.text.toString() + "+"
                val sonuc = topla()
                mainBinding.textViewSonuc.text = sonuc.toString()
            }else{
                if(mainBinding.textViewHafiza.text.last() != '+'){
                    mainBinding.textViewHafiza.text = mainBinding.textViewHafiza.text.toString() + "+"
                }
            }
        }

        mainBinding.buttonSonuc.setOnClickListener {
            if(deger != ""){
                numberList.add(deger.toInt())
                deger = ""
                val sonuc = topla()
                mainBinding.textViewHafiza.text = sonuc.toString() + "+"
                mainBinding.textViewSonuc.text = sonuc.toString()
            }
        }
    }

    fun topla() : Int{
        var sonuc = 0
        for(item in numberList){
            sonuc = sonuc + item
        }
        return sonuc
    }

    fun yazdir(sayi : String){
        deger += sayi
        Log.e("Değer",deger)
        mainBinding.textViewHafiza.text = mainBinding.textViewHafiza.text.toString() + sayi
    }
}