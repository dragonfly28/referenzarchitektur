/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.muenchen.referenzarchitektur;

import de.muenchen.referenzarchitektur.servicea.events.FooEvent;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 *
 * @author robert.jasny
 */
@EnableBinding(FooInbound.class)
public class ServiceDController {
    
    @StreamListener(FooInbound.FOO_INPUT)
    public void processFooEvent(FooEvent foo) {
        System.out.println("ServiceD: " + foo.getValueA() + " und " + foo.getValueB());
    }
}
