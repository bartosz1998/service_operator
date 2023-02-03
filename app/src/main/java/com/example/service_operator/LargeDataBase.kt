package com.example.service_operator

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [LargeNews::class], version = 1)
abstract class LargeDataBase : RoomDatabase(){
    abstract fun largeNewsDao(): LargeNewsDao

    companion object {
        @Volatile
        private var INSTANCE: LargeDataBase? = null

        fun getDatabase(context: Context): LargeDataBase{
            val tempInstance = INSTANCE

            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    LargeDataBase::class.java,
                    "user_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}