package com.example.service_operator.room.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "large_table")
class LargeNews (

    @PrimaryKey(autoGenerate = true)
    val id: Int,

    val title: String
): Parcelable