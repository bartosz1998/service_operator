package com.example.service_operator

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LargeNewsViewModel(application: Application): AndroidViewModel(application) {
    val readAllData: LiveData<List<LargeNews>>
    private val repository: LargeNewsRepository

    init {
        val userDao = LargeDataBase.getDatabase(application).largeNewsDao()
        repository= LargeNewsRepository(userDao)
        readAllData = repository.readAllData
    }

    fun addUser(largeNews: LargeNews) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addUser(largeNews)
        }
    }

}