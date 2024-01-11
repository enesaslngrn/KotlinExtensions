package com.enesas.kotlinextensions

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.enesas.kotlinextensions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        var benimStringim = "Enes"
        benimStringim.benimEklentim("Aslangören")


        // https://raw.githubusercontent.com/atilsamancioglu/BTK20-JSONVeriSeti/master/muz.png MUZ RESMİ'NİN OLDUĞU URL
        // https://raw.githubusercontent.com/atilsamancioglu/BTK20-JSONVeriSeti/master/elma.png ELMA RESMİ'NİN OLDUĞU URL

        binding.imageViewGlide.glideGorselIndir("https://raw.githubusercontent.com/atilsamancioglu/BTK20-JSONVeriSeti/master/muz.png")
        binding.imageViewPicasso.picassoGorselIndir("https://raw.githubusercontent.com/atilsamancioglu/BTK20-JSONVeriSeti/master/elma.png")

    }
}