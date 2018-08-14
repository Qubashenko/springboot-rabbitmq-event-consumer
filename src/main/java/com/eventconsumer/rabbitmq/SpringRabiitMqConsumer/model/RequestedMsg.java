package com.eventconsumer.rabbitmq.SpringRabiitMqConsumer.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@NoArgsConstructor
public class RequestedMsg {

    public RequestedMsg(List<User> requestedBody){
        this.requestedBody = requestedBody;
    }

    @Getter @Setter
    String id;
    @Getter @Setter
    String requestedHeader;
    @Getter @Setter
    String requestedCode;
    @Getter @Setter
    List<User> requestedBody;

}