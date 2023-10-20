package com.example.skripsi2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.skripsi2.Data.Gangguan
import com.example.skripsi2.databinding.ActivityDetailGangguanBinding
import kotlinx.android.synthetic.main.activity_detail_gangguan.*

class DetailGangguanActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailGangguanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_gangguan)
        binding = ActivityDetailGangguanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gangguan = intent.getParcelableExtra<Gangguan>("Gangguan")
        gangguan?.apply {
            DetailGambar.setImageResource(gangguan.gambar)
            DetailNama.text = gangguan.nama
            DetailKeterangan.text = gangguan.keterangan
            binding.DetailURL.setOnClickListener{
                val openUrl = Intent(android.content.Intent.ACTION_VIEW)
                openUrl.data = Uri.parse(gangguan.url)
                startActivity(openUrl)
            }
            DetailURL.text = gangguan.url
        }


    }

}