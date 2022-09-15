package com.example.doadandzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doadandzikir.adapter.DzikirDoaAdapter
import com.example.doadandzikir.data.DataDzikirDoa
import com.example.doadandzikir.model.DzikirDoa

class HarianDzikirDoaActivity : AppCompatActivity() {

    private val listDzikir: ArrayList<DzikirDoa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_harian_dzikir_doa)

        val rvDzikirHarian = findViewById<RecyclerView>(R.id.rv_dzikir_harian)
        rvDzikirHarian.layoutManager = LinearLayoutManager(this)
        rvDzikirHarian.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikir)
    }
    private fun initData(){
        val desc = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafadz = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemah = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        for (data in desc.indices) {
            val dzikir = DzikirDoa(
                desc[data],
                lafadz[data],
                terjemah[data]
            )
            listDzikir.add(dzikir)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return false

    }
}