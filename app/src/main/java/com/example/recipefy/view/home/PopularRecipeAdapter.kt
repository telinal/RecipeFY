package com.example.recipefy.view.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipefy.R
import com.example.recipefy.databinding.HomeItemViewHBinding
import com.google.android.material.imageview.ShapeableImageView

class PopularRecipeAdapter(val pictures: ArrayList<Store>) :
    RecyclerView.Adapter<PopularRecipeAdapter.PopularViewHolder>() {



    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val data = pictures[position]
        holder.setData(data)
    }

    inner class PopularViewHolder(private val binding: HomeItemViewHBinding) : RecyclerView.ViewHolder(binding.root) {
        fun setData(store: Store) {
            binding.store = store
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {

        val itemView = HomeItemViewHBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PopularViewHolder(itemView)
    }



    override fun getItemCount(): Int {
        return pictures.size
    }



}

