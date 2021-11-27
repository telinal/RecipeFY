package com.example.recipefy.view.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipefy.R
import com.google.android.material.imageview.ShapeableImageView

class PopularRecipeAdapter(val pictures: ArrayList<Store>) :
    RecyclerView.Adapter<PopularRecipeAdapter.PopularViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        // create inflate object (Inflater : takes our xml file and convert it into java object)
        val inflater = LayoutInflater.from(parent.context)
        // here we inflate home_item_view which we created and it return view
        val view = inflater.inflate(R.layout.home_item_view_h, parent, false)
        // pass the view to MyViewHolder class
        return PopularViewHolder(view)

//        OR
//        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.home_item_view_h, parent, false)
//        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val currentItem = pictures[position]
        holder.popularImageV.setImageResource(currentItem.imageStore)
        holder.popularRecipeV.text = currentItem.titleStore
    }

    override fun getItemCount(): Int {
        return pictures.size
    }

    inner class PopularViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val popularImageV: ShapeableImageView = itemView.findViewById((R.id.popularImage))
        val popularRecipeV: TextView = itemView.findViewById(R.id.popularRecipeName)
    }

}

