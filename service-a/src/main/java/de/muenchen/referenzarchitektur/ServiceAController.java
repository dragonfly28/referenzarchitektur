/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.muenchen.referenzarchitektur;

import de.muenchen.referenzarchitektur.servicea.events.FooEvent;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author robert.jasny
 */
@RestController
@EnableBinding(FooOutbound.class)
public class ServiceAController {

    private final FooOutbound output;

    @RequestMapping("/servus")
    String sayServus() {
        return "Servus!";
    }

    public ServiceAController(FooOutbound fooOutbound) {
        this.output = fooOutbound;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @PostMapping("/fooEvent")
    public String fooEvent(@RequestBody FooEvent fooEvent) {
        System.out.println(fooEvent);
        // build message
        Message<FooEvent> msg = MessageBuilder.withPayload(fooEvent).build();
        // send message
        this.output.fooEvent().send(msg);
        return fooEvent.getValueA() + " und " + fooEvent.getValueB();
    }

}
