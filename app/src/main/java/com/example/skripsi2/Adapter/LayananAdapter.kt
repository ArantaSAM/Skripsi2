package com.example.skripsi2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.skripsi2.Data.Layanan
import com.example.skripsi2.Object.DataLayanan.list
import com.example.skripsi2.R
import kotlinx.android.synthetic.main.item_layanan.view.item_gambar
import kotlinx.android.synthetic.main.item_layanan.view.item_nama
import kotlinx.android.synthetic.main.item_layanan.view.item_url

class LayananAdapter(val List: ArrayList<Layanan>) :
    RecyclerView.Adapter<LayananAdapter.ViewHolder>()
{
    var onItemClickListerner: ((Layanan) -> Unit)? = null

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(layanan: Layanan) {
            with(itemView) {
                item_gambar.setImageResource(layanan.gambar)
                item_nama.text = layanan.nama
                item_url.text = layanan.url
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_layanan, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val layanan = list.get(position)
        holder.bind(layanan)
        holder.itemView.setOnClickListener{
            onItemClickListerner?.let { it1 -> it1(layanan) }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}