package com.example.recipefy.view.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipefy.R

class LatestRecipeAdapter(
    private val myList: List<Store>
): RecyclerView.Adapter<LatestRecipeAdapter.LatestRecipeViewHolder>() {

    inner class LatestRecipeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView = itemView.findViewById<ImageView>(R.id.popularImage)
        val titleTextView = itemView.findViewById<TextView>(R.id.text)
        fun setData(store: Store){
            titleTextView.text = store.titleStore
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestRecipeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recipe_item_view, parent, false)
        return LatestRecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: LatestRecipeViewHolder, position: Int) {
        val data = myList[position]
        holder.setData(data)

    }

    override fun getItemCount(): Int {
       return myList.size
    }
}