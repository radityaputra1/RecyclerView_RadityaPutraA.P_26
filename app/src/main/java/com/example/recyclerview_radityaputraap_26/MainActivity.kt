package com.example.recyclerview_radityaputraap_26

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.gojo,
                "Gojo Satoru",
                "Gojo Satoru adalah salah satu karakter yang ada di anime “Jujutsu Kaisen”, merupakan penyihir Jujutsu terkuat dan menjadi karakter yang paling ditakuti."
            ),
            Superhero(
                R.drawable.goku,
                "Goju",
                "Goku merupakan tokoh Anime terkuat di semua anime dalam kisah Dragon Ball. Goku yang memiliki ekor ini adalah bangsa Saiya, walaupun dia tidak mengetahui hal itu sampai Raditz memberitahu sejarah masa kecilnya."
            ),
            Superhero(
                R.drawable.hisoka,
                "Hisoka",
                "Hisoka adalah salah satu tokoh antagonis utama dalam serial Hunter x Hunter oleh Yoshihiro Togashi"
            ),
            Superhero(
                R.drawable.kilua,
                "Killua Zoldyck",
                "Killua Zaoldyeck adalah salah satu dari empat tokoh utama dalam serial Hunter × Hunter karya Yoshihiro Togashi. Killua lahir sebagai Anak dari keluarga pembunuh bayaran yang sangat terkenal dan ditakuti oleh banyak golongan. Killua anak ketiga dari 5 bersaudara."
            ),
            Superhero(
                R.drawable.kurapika,
                "Kurapika",
                "Kurapika merupakan tokoh di serial Hunter x Hunter"
            ),
            Superhero(
                R.drawable.saitama,
                "Saiatama",
                "Saiatama merupakan tokoh di anime “OnePunchMan“,digambarkan sebagai sosok tampan, kuat, atau super cool"
            ),
            Superhero(
                R.drawable.vegeta,
                "Vegeta",
                "Vegeta adalah karakter fiksi dalam seri manga Dragon Ball dan anime Dragon Ball Z ciptaan Akira Toriyama."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperHeroAdapter(this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}