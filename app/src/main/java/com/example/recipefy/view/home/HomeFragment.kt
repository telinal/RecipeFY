package com.example.recipefy.view.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.recipefy.R
import com.example.recipefy.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    private lateinit var myRecyclerView: RecyclerView
    private lateinit var myArrayList: ArrayList<Store>
    lateinit var imageId: Array<Int>
    lateinit var title: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

        imageId = arrayOf(R.drawable.dumplings, R.drawable.noodles)
        title = arrayOf("dumplings", "noodles")



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        myArrayList = arrayListOf(
            Store(
                imageLink = "https://www.subbuskitchen.com/wp-content/uploads/2014/01/Veg-Noodles.jpg",
                titleStore = "Dumplings"
            ),
            Store(
                imageLink = "https://www.subbuskitchen.com/wp-content/uploads/2014/01/Veg-Noodles.jpg",
                titleStore = "Dumplings"
            )
        )
        myArrayList.add(
            Store(
                imageLink = "https://www.subbuskitchen.com/wp-content/uploads/2014/01/Veg-Noodles.jpg",
                titleStore = "Dumplings"
            )
        )
        myArrayList.add(
            Store(
                imageLink = "https://www.subbuskitchen.com/wp-content/uploads/2014/01/Veg-Noodles.jpg",
                titleStore = "Dumplings"
            )
        )
        myArrayList.add(
            Store(
                imageLink = "https://www.subbuskitchen.com/wp-content/uploads/2014/01/Veg-Noodles.jpg",
                titleStore = "Dumplings"
            )
        )

        binding.recyclerViewHorizontal.adapter = PopularRecipeAdapter(myArrayList)
        binding.recyclerViewVertical.adapter = LatestRecipeAdapter(myArrayList)

        binding.searchBox.setOnClickListener() {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToSearchFragment())

        }
    }

}
