package com.example.recipefy.view.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipefy.R
import com.example.recipefy.databinding.HomeItemViewHBinding
import com.example.recipefy.databinding.HomeItemViewVBinding

class LatestRecipeAdapter(val myList: ArrayList<Store>):
    RecyclerView.Adapter<LatestRecipeAdapter.LatestRecipeViewHolder>() {

    override fun onBindViewHolder(holder: LatestRecipeViewHolder, position: Int) {
        val data = myList[position]
        holder.setData(data)

    }

    inner class LatestRecipeViewHolder(private val binding: HomeItemViewVBinding): RecyclerView.ViewHolder(binding.root){
        fun setData(store: Store){
            binding.store = store

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestRecipeViewHolder {
        val view = HomeItemViewVBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LatestRecipeViewHolder(view)
    }

    override fun getItemCount(): Int {
       return myList.size
    }
}