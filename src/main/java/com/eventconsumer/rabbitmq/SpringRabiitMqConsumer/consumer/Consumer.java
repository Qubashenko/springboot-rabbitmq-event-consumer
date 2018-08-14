package com.eventconsumer.rabbitmq.SpringRabiitMqConsumer.consumer;


import com.eventconsumer.rabbitmq.SpringRabiitMqConsumer.model.EventMsg;
import com.eventconsumer.rabbitmq.SpringRabiitMqConsumer.model.RequestedMsg;
import com.eventconsumer.rabbitmq.SpringRabiitMqConsumer.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.time.LocalDateTime;

@Component
public class Consumer {

    final public static Logger logger = LoggerFactory.getLogger(Consumer.class);

    @Autowired
    EventMsg eventMsg;
    @Autowired
    RequestedMsg requestedMsg;
    @Autowired
    User user;

    @RabbitListener(queues = "${ec.rabbitmq.queue}")
    public void consumeEvent(EventMsg eventMsg) {
        logger.info("Event Msg: " + eventMsg.toString());
    }
}
