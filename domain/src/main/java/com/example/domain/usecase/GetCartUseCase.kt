package com.example.domain.usecase

import com.example.domain.model.CartModel
import com.example.domain.network.ResultWrapper
import com.example.domain.repository.CartRepository

class GetCartUseCase(private val cartRepository: CartRepository) {
    suspend fun execute(userId: Long) = cartRepository.getCart(userId)
}