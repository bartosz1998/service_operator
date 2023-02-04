package com.example.service_operator.room.Dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.service_operator.room.Entity.LargeNews

@Dao
interface LargeNewsDao {
    @Insert
    fun addUser(largeNews: LargeNews)

    @Query("SELECT * from large_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<LargeNews>>
}