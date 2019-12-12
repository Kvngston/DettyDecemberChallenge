package com.triptolemus.dettydecember

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.triptolemus.dettydecember.Model.Model

class RecyclerViewAdapter(private val items : List<Model.Item>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val itemImageFrame = view.findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.constraintLayout)
        private val itemImage2Frame = view.findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.constraintLayout2)
        private val itemImage = view.findViewById<ImageView>(R.id.image1)
        private val itemImage2 = view.findViewById<ImageView>(R.id.image2)
        private val itemName = view.findViewById<TextView>(R.id.itemName)
        private val itemName2 = view.findViewById<TextView>(R.id.itemName2)
        private val itemPrice = view.findViewById<TextView>(R.id.itemPrice)
        private val itemPrice2 = view.findViewById<TextView>(R.id.itemPrice2)
        private val rating1 = view.findViewById<RatingBar>(R.id.ratingBar1)
        private val rating2 = view.findViewById<RatingBar>(R.id.ratingBar2)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_list_items,parent,false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }
}