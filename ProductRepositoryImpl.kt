package com.example.app.data.repository

import com.example.app.data.local.dao.ProductDao
import com.example.app.data.mapper.ProductMapper
import com.example.app.domain.model.Product
import com.example.app.domain.repository.ProductRepository

class ProductRepositoryImpl(private val dao: ProductDao) : ProductRepository {
    override suspend fun add(product: Product): Long =
        dao.insert(ProductMapper.modelToEntity(product))

    override suspend fun getAll(): List<Product> =
        dao.getAll().map(ProductMapper::entityToModel)

    override suspend fun update(product: Product) =
        dao.update(ProductMapper.modelToEntity(product))

    override suspend fun delete(product: Product) =
        dao.delete(ProductMapper.modelToEntity(product))
}