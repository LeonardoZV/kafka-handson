package br.com.itau.kafka.handson.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import br.com.itau.kafka.handson.KafkaHandsonApplication;

@Component
@Endpoint(id="restart-spring-context")
public class RestartSpringContext {

	@WriteOperation
    public void restart() {
        KafkaHandsonApplication.restart();
    }
	
}
