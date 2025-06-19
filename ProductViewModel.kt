package com.example.app.presentation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.app.domain.model.Product
import com.example.app.domain.usecase.ProductUseCases
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ProductViewModel(private val useCases: ProductUseCases) : ViewModel() {
    private val _products = MutableStateFlow<List<Product>>(emptyList())
    val products: StateFlow<List<Product>> = _products

    fun load() = viewModelScope.launch {
        try { _products.value = useCases.getProducts() }
        catch (e: Exception) { }
    }

    fun add(name: String, price: Double) = viewModelScope.launch {
        try {
            useCases.addProduct(Product(0, name, price))
            load()
        } catch (e: Exception) { }
    }
}