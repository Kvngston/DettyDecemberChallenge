package com.triptolemus.dettydecember.Model

import android.media.Image
import android.widget.ImageView

object Model {

    data class Item(val image: Image,
                    val imagePrice: String,
                    val imageName: String,
                    val imageRating: String)
}