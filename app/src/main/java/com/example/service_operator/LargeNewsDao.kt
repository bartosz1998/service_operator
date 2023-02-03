package com.example.service_operator

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface LargeNewsDao {
    @Insert
    fun addUser(largeNews: LargeNews)

    @Query("SELECT * from large_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<LargeNews>>
}