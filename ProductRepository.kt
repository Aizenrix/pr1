package com.example.app.domain.repository

import com.example.app.domain.model.Product

interface ProductRepository {
    suspend fun add(product: Product): Long
    suspend fun getAll(): List<Product>
    suspend fun update(product: Product)
    suspend fun delete(product: Product)
}