package com.example.skripsi2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.skripsi2.Adapter.LayananAdapter
import com.example.skripsi2.Data.Layanan
import com.example.skripsi2.Object.DataLayanan
import com.example.skripsi2.databinding.ActivityLayananBinding
import kotlinx.android.synthetic.main.activity_layanan.RvListLayanan
import kotlinx.android.synthetic.main.item_layanan.view.item_gambar
import kotlinx.android.synthetic.main.item_layanan.view.item_url

class LayananActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLayananBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layanan)
        binding = ActivityLayananBinding.inflate(layoutInflater)
        setContentView(binding.root)
        RvListLayanan.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        val list = DataLayanan.list
        val adapter = LayananAdapter(list)
        RvListLayanan.adapter = adapter
        RvListLayanan.addItemDecoration(DividerItemDecoration(this, LinearLayout.HORIZONTAL))
adapter.onItemClickListerner={
    Toast.makeText(this, "Mohon maaf, untuk saat ini menuju link belum bisa ", Toast.LENGTH_LONG).show()
}
        }
    }
