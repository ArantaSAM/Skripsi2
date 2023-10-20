package com.example.skripsi2.Object

import com.example.skripsi2.Data.Layanan
import com.example.skripsi2.R

object DataLayanan {

    val list: ArrayList<Layanan>
        get() {
            val list: ArrayList<Layanan> = arrayListOf()

            list.add(
                Layanan(
                    nama = "Ibunda",
                    url = "ibunda.id",
                    gambar = R.drawable.ibunda
                )
            )
            list.add(
                Layanan(
                    nama = "Layanan",
                    url = "https://satupersen.net/",
                    gambar = R.drawable.satupersen
                )
            )

            list.add(
                Layanan(
                    nama = "Bincang Psikologi",
                    url = "https://bincangpsikologi.com/",
                    gambar = R.drawable.bincangpsikologi
                )
            )

            return list
        }
}