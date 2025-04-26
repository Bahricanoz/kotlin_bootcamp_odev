package com.example.kotlin_temelleri.odev

fun main(){

    val fonksiyonlar = Fonksiyonlar()

    val dereceSonuc = fonksiyonlar.dereceDonusum(36.5)
    println("Derece sonucu : ${dereceSonuc}")

    fonksiyonlar.dikdortgenCevreHesabi(5,7)

    val faktoriyelSonuc = fonksiyonlar.faktoriyelHesabi(4)
    println("Faktoriyel sonucu : ${faktoriyelSonuc}")

    fonksiyonlar.harfAdetHesabi("Bahri")

    val icAcilarToplami = fonksiyonlar.icAcilarToplami(6)
    println("Ic Aci Toplami : ${icAcilarToplami}")

    val maasHesabiSonuc = fonksiyonlar.maasHesabi(30)
    println("Maas hesabi : ${maasHesabiSonuc}")

    val kotaUcreti = fonksiyonlar.kotaUcreti(60)
    println("Kota ucreti hesabi : ${kotaUcreti}")


}