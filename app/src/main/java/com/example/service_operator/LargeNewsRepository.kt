package com.example.service_operator

import androidx.lifecycle.LiveData

class LargeNewsRepository(private val largeNewsDao: LargeNewsDao) {
    val readAllData: LiveData<List<LargeNews>> = largeNewsDao.readAllData()

     fun addUser(largeNews: LargeNews) {
        largeNewsDao.addUser(largeNews)
    }
}