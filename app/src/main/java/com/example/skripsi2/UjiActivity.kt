package com.example.skripsi2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_uji.buttonResult
import kotlinx.android.synthetic.main.activity_uji.g1
import kotlinx.android.synthetic.main.activity_uji.g10
import kotlinx.android.synthetic.main.activity_uji.g11
import kotlinx.android.synthetic.main.activity_uji.g12
import kotlinx.android.synthetic.main.activity_uji.g13
import kotlinx.android.synthetic.main.activity_uji.g14
import kotlinx.android.synthetic.main.activity_uji.g15
import kotlinx.android.synthetic.main.activity_uji.g16
import kotlinx.android.synthetic.main.activity_uji.g17
import kotlinx.android.synthetic.main.activity_uji.g18
import kotlinx.android.synthetic.main.activity_uji.g19
import kotlinx.android.synthetic.main.activity_uji.g2
import kotlinx.android.synthetic.main.activity_uji.g20
import kotlinx.android.synthetic.main.activity_uji.g21
import kotlinx.android.synthetic.main.activity_uji.g22
import kotlinx.android.synthetic.main.activity_uji.g23
import kotlinx.android.synthetic.main.activity_uji.g24
import kotlinx.android.synthetic.main.activity_uji.g25
import kotlinx.android.synthetic.main.activity_uji.g26
import kotlinx.android.synthetic.main.activity_uji.g27
import kotlinx.android.synthetic.main.activity_uji.g28
import kotlinx.android.synthetic.main.activity_uji.g29
import kotlinx.android.synthetic.main.activity_uji.g3
import kotlinx.android.synthetic.main.activity_uji.g30
import kotlinx.android.synthetic.main.activity_uji.g31
import kotlinx.android.synthetic.main.activity_uji.g32
import kotlinx.android.synthetic.main.activity_uji.g33
import kotlinx.android.synthetic.main.activity_uji.g34
import kotlinx.android.synthetic.main.activity_uji.g35
import kotlinx.android.synthetic.main.activity_uji.g36
import kotlinx.android.synthetic.main.activity_uji.g37
import kotlinx.android.synthetic.main.activity_uji.g38
import kotlinx.android.synthetic.main.activity_uji.g39
import kotlinx.android.synthetic.main.activity_uji.g4
import kotlinx.android.synthetic.main.activity_uji.g40
import kotlinx.android.synthetic.main.activity_uji.g41
import kotlinx.android.synthetic.main.activity_uji.g42
import kotlinx.android.synthetic.main.activity_uji.g43
import kotlinx.android.synthetic.main.activity_uji.g44
import kotlinx.android.synthetic.main.activity_uji.g5
import kotlinx.android.synthetic.main.activity_uji.g6
import kotlinx.android.synthetic.main.activity_uji.g7
import kotlinx.android.synthetic.main.activity_uji.g8
import kotlinx.android.synthetic.main.activity_uji.g9
import kotlinx.android.synthetic.main.activity_uji.hasilview

class UjiActivity : AppCompatActivity() {
    val jg1: String = "Fobia Sosial"
    val jg2: String = "Kecemasan Menyeluruh"
    val jg3: String = "Gangguan Panik"
    val jg4: String = "Stress Paska Trauma"
    val jg5: String = "Gangguan Obsesif / kompulsif"

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uji)

        buttonResult.setOnClickListener {

                // Fobia Sosial
                if(g1.isChecked){
                    hasilview.text = "$jg1 atau $jg2 atau $jg3 atau $jg4 atau $jg5"
                }
                if(g2.isChecked) {
                    hasilview.text = "$jg1 atau $jg2 atau $jg3 atau $jg4"
                }
                if(g3.isChecked) {
                    hasilview.text = "$jg1 atau $jg2 atau $jg3 atau $jg4"
                }
                if(g4.isChecked) {
                    hasilview.text = "$jg1 atau $jg2 atau $jg3"
                }
                if(g5.isChecked) {
                    hasilview.text = "$jg1 atau $jg2"
                }
                if(g6.isChecked) {
                    hasilview.text = "$jg1 atau $jg2"
                }
                if(g9.isChecked) {
                    hasilview.text = "$jg1 atau $jg3"
                }
                if(g10.isChecked) {
                    hasilview.text = jg1
                }
                if(g11.isChecked) {
                    hasilview.text = "$jg1 atau $jg2"
                }
                if(g12.isChecked) {
                    hasilview.text = jg1
                }
                if(g13.isChecked) {
                    hasilview.text = jg1
                }

                // Kecemasan Menyeluruh
                if(g7.isChecked) {
                    hasilview.text = "$jg2 atau $jg3"
                }

                if(g8.isChecked) {
                    hasilview.text = "$jg2 atau $jg3"
                }

                if(g14.isChecked) {
                    hasilview.text = jg2
                }

                if(g15.isChecked) {
                    hasilview.text = jg2
                }

                if(g16.isChecked) {
                    hasilview.text = jg2
                }

                if(g17.isChecked) {
                    hasilview.text = jg2
                }

                if(g18.isChecked) {
                    hasilview.text = jg2
                }

                if(g19.isChecked) {
                    hasilview.text = jg2
                }

                if(g20.isChecked) {
                    hasilview.text = jg2
                }

                if(g21.isChecked) {
                    hasilview.text = jg2
                }

                //gangguan panik
                if(g22.isChecked) {
                    hasilview.text = jg3
                }

                if(g23.isChecked) {
                    hasilview.text = jg3
                }

                if(g24.isChecked) {
                    hasilview.text = jg3
                }

                if(g25.isChecked) {
                    hasilview.text = jg3
                }

                //PTSD atau Gangguan Stress Paska Trauma
                if(g26.isChecked) {
                    hasilview.text = jg4
                }

                if(g27.isChecked) {
                    hasilview.text = jg4
                }

                if(g28.isChecked) {
                    hasilview.text = jg4
                }

                if(g29.isChecked) {
                    hasilview.text = jg4
                }

                if(g30.isChecked) {
                    hasilview.text = jg4
                }

                if(g31.isChecked) {
                    hasilview.text = jg4
                }

                if(g32.isChecked) {
                    hasilview.text = jg4
                }

                if(g33.isChecked) {
                    hasilview.text = jg4
                }

                if(g34.isChecked) {
                    hasilview.text = jg4
                }

                if(g35.isChecked) {
                    hasilview.text = jg4
                }

                if(g36.isChecked) {
                    hasilview.text = jg4
                }

                if(g37.isChecked) {
                    hasilview.text = jg4
                }

                //Gangguan Obsesif / kompulsif

                if(g38.isChecked) {
                    hasilview.text = jg5
                }

                if(g39.isChecked) {
                    hasilview.text = jg5
                }

                if(g40.isChecked) {
                    hasilview.text = jg5
                }

                if(g41.isChecked) {
                    hasilview.text = jg5
                }

                if(g42.isChecked) {
                    hasilview.text = jg5
                }

                if(g43.isChecked) {
                    hasilview.text = jg5
                }

                if(g44.isChecked) {
                    hasilview.text = jg5
                }
        }
    }
}