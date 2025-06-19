package com.example.app.data.local.dao

import androidx.room.*
import com.example.app.data.local.entity.ProductEntity

@Dao
interface ProductDao {
    @Insert suspend fun insert(entity: ProductEntity): Long
    @Query("SELECT * FROM products") suspend fun getAll(): List<ProductEntity>
    @Update suspend fun update(entity: ProductEntity)
    @Delete suspend fun delete(entity: ProductEntity)
}