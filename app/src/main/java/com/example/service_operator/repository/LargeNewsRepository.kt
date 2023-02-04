package com.example.service_operator.repository

import androidx.lifecycle.LiveData
import com.example.service_operator.room.Entity.LargeNews
import com.example.service_operator.room.Dao.LargeNewsDao

class LargeNewsRepository(private val largeNewsDao: LargeNewsDao) {
    val readAllData: LiveData<List<LargeNews>> = largeNewsDao.readAllData()

     fun addUser(largeNews: LargeNews) {
        largeNewsDao.addUser(largeNews)
    }
}