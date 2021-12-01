package com.example.recipefy.view.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SearchViewModel: ViewModel() {
    val queryLiveDataObject = MutableLiveData<String>()

    val queryLiveData: LiveData<String>
    get() = queryLiveDataObject

    fun updateLiveData() {
        queryLiveDataObject.value = ""
    }
}