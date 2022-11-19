package com.itmo.fitip.ppo.orderservice.logic

import com.itmo.fitip.ppo.orderservice.api.OrderAggregate
import ru.quipy.domain.AggregateState
import java.util.*

class Order : AggregateState<UUID, OrderAggregate> {
    private lateinit var orderId: UUID
    private lateinit var userId: UUID
    private lateinit var state: String
    private var price: Int = 0
    var positions: MutableMap<UUID, Position> = mutableMapOf()

    override fun getId() = orderId

//    fun createOrder(id: UUID = UUID.randomUUID(), userId: UUID):

}

data class Position(
    val id: UUID
) {

}