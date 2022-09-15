package com.example.numberfactapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FactDao {

    @Query("SELECT * FROM fact ORDER BY id ASC")
    suspend fun getAllFact(): List<Fact>

    @Query("SELECT * FROM fact WHERE id =:id")
    suspend fun getFactById(id: Long):Fact

    @Insert
    suspend fun addFact(fact: Fact)

    @Delete
    suspend fun deleteFact(fact: Fact)
}