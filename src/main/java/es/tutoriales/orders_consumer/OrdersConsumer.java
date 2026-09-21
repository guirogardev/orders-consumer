package es.tutoriales.orders_consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrdersConsumer {

    @KafkaListener(
            topics = "orders.created",
            groupId = "orders-consumer"
    )
    public void receive(String message) {
        System.out.println("=================================");
        System.out.println("MENSAJE RECIBIDO: " + message);
        System.out.println("=================================");
    }
}
