package com.example.numberfactapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fact")
data class Fact(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val number: Long,
    val fact:String
)