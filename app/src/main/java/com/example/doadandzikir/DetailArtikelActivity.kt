package com.example.doadandzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailArtikelActivity : AppCompatActivity() {

    companion object {
        const val DATA_TITTLE = "tittle"
        const val DATA_DESC = "data"
        const val DATA_IMAGE = "image"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Artikel Islami"
        setContentView(R.layout.activity_detail_artikel)

        val dataTittle = intent.getStringExtra(DATA_TITTLE)
        val dataDesc = intent.getStringExtra(DATA_DESC)
        val dataImage = intent.getIntExtra(DATA_IMAGE,0)

        val tvTittle: TextView = findViewById(R.id.tv_detail_tittle)
        tvTittle.text = dataTittle
        val tvDesc: TextView = findViewById(R.id.tv_detail_desc)
        tvDesc.text = dataDesc
        val imgArtikel: ImageView = findViewById(R.id.img_detail)
        imgArtikel.setImageResource(dataImage)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return false

    }
}