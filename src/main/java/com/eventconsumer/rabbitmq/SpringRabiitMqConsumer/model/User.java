package com.eventconsumer.rabbitmq.SpringRabiitMqConsumer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class User {

    @Setter @Getter
    public int id;
    @Setter @Getter
    public String name;
    @Setter @Getter
    public String mobileNum;
    @Setter @Getter
    public String email;

}
