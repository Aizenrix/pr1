package com.example.app.domain.usecase

import com.example.app.domain.model.Product
import com.example.app.domain.repository.ProductRepository

class ProductUseCases(private val repo: ProductRepository) {
    suspend fun addProduct(product: Product) = repo.add(product)
    suspend fun getProducts(): List<Product> = repo.getAll()
    suspend fun updateProduct(product: Product) = repo.update(product)
    suspend fun deleteProduct(product: Product) = repo.delete(product)
}