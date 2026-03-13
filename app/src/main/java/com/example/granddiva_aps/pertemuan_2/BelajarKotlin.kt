package com.example.granddiva_aps.pertemuan_2

fun main() {
    println("Hai rekan-rekan...")
    println("Selamat datang di bahasa pemograman kotlin")

    println("==================")

    var angka = 15
    println("Hasil dari 15 + 10 = ${angka + 10}")

    val nilaiInt = 10000
    val nilaiDouble = 100.003
    val nilaiFloat = 1000.0f

    println("Nilia Integer = $nilaiInt")
    println("Nilai Double = $nilaiDouble")
    println("NilaiFloat = $nilaiFloat")

    println("=========STRING========")
    val huruf = 'a'
    println("Ini penggunaan karakter '$huruf'")

    val nilaiString = "Mawar"
    println("Hal;o $nilaiString!\nApa kabar?")

    println("=========KONDISI=========")

    val nilai = 10
    if (nilai < 0)
        println("Bilangan Negatif")
    else {
        if (nilai % 2 == 0)
            println("bilangan Genap")
        else
            println("Bilangan Ganjil")
    }

    println("=========PERULANGAN==========")
    val kampusKU: Array<String> = arrayOf("kampus", "Politeknik", "caltex", "Riau")
    for (kampus: String in kampusKU)
        println(kampus)

}