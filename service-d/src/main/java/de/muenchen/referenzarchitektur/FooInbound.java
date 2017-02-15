/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.muenchen.referenzarchitektur;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 *
 * @author robert.jasny
 */
public interface FooInbound {
    
    public final String FOO_INPUT = "fooEvent";
    
    @Input(FOO_INPUT)
    SubscribableChannel input();
    
}
