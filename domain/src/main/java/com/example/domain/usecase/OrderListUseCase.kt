package com.example.domain.usecase

import com.example.domain.model.OrdersListModel
import com.example.domain.network.ResultWrapper
import com.example.domain.repository.OrderRepository

class OrderListUseCase(private val orderRepository: OrderRepository) {
    suspend fun execute(userId: Long)=orderRepository.getOrderList(userId)
}