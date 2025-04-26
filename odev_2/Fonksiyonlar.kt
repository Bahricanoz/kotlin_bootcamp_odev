package com.example.kotlin_temelleri.odev

class Fonksiyonlar {

    fun dereceDonusum(derece : Double): Double{
        val sonuc = derece * 1.8 +32
        return  sonuc;
    }

    fun dikdortgenCevreHesabi(kenar1 : Int, kenar2 : Int){
        val cevreUzunlugu = 2*(kenar1 + kenar2)
        println("Kenar 1 ${kenar1} ve " +
                "Kenar 2 ${kenar2} " +
                "uzunlugu olan dikdortgenin cevresi : ${cevreUzunlugu}  ")
    }

    fun faktoriyelHesabi(sayi : Int): Int{
        var sonuc= 1;
        for (x in 1..sayi){
            sonuc = sonuc * x
        }
        return  sonuc;
    }

    fun harfAdetHesabi(kelime : String){
        var sonuc = 0;
        for(x in kelime){
            if(x =='a' || x == 'A'){
                sonuc++
            }
        }
        println("${kelime} kelimesinde ${sonuc} adet a harfi var")
    }

    fun icAcilarToplami(kenarSayisi : Int) : Int{
        val sonuc = (kenarSayisi -2) * 180
        return  sonuc;
    }

    fun maasHesabi(gun : Int) : Int{
        val calismaSaatiUcreti = 10
        val mesaiUcreti = 20
        val calisilanSaat = gun *8

        var maas = 0
        if(calisilanSaat <= 160){
            maas = calisilanSaat * calismaSaatiUcreti
        }else{
            maas = 160 * calismaSaatiUcreti + (calisilanSaat- 160)* mesaiUcreti
        }
        return  maas;
    }

    fun kotaUcreti(kota : Int): Int{
        val asimUcreti = 4
        val minKota = 50
        val minKotaUcreti = 100
        var ucret = 0

        if(kota > minKota){
            ucret = minKotaUcreti + (kota-minKota) * asimUcreti
        }else{
            ucret = minKotaUcreti
        }
        return  ucret
    }
}