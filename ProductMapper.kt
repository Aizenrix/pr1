package com.example.app.data.mapper

import com.example.app.data.local.entity.ProductEntity
import com.example.app.domain.model.Product

object ProductMapper {
    fun entityToModel(e: ProductEntity): Product = Product(e.id, e.name, e.price)
    fun modelToEntity(m: Product): ProductEntity = ProductEntity(m.id, m.name, m.price)
}