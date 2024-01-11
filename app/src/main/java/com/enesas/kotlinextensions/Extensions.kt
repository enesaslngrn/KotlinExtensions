package com.enesas.kotlinextensions

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso

fun String.benimEklentim(parametre : String){ // Yani zaten hazır olan String sınıfına eklenti yaptık.
    println(parametre)
}

// O yüzden mesela Glide veya picasso gibi kütüphaneleri de ImageView sınıfından bir eklenti haline getirip her yerde kullanabiliriz.

fun ImageView.glideGorselIndir(url : String?){

    Glide.with(context).load(url).into(this) //Yani ImageView'a bağladık bunu artık. Nerede imageView oluşturursak oluşturalım bu eklentiyi kullanabileceğiz.
}

fun ImageView.picassoGorselIndir(url : String?){

    Picasso.get().load(url).into(this)
}