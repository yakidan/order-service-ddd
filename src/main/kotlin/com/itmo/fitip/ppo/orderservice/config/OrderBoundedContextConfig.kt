package com.itmo.fitip.ppo.orderservice.config

import com.itmo.fitip.ppo.orderservice.api.OrderAggregate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.quipy.core.EventSourcingService
import ru.quipy.core.EventSourcingServiceFactory
import java.util.*

@Configuration
class OrderBoundedContextConfig {
    @Autowired
    private lateinit var eventSourcingServiceFactory: EventSourcingServiceFactory

//    @Bean
//    fun accountEsService(): EventSourcingService<UUID, OrderAggregate, Order> =
//        eventSourcingServiceFactory.create()
}