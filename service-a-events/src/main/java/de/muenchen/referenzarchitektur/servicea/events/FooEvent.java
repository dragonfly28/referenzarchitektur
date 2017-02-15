/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.muenchen.referenzarchitektur.servicea.events;

/**
 *
 * @author robert.jasny
 */
public class FooEvent {

    private String valueA;
    private String valueB;

    public void setValueA(String valueA) {
        this.valueA = valueA;
    }

    public String getValueA() {
        return valueA;
    }

    public void setValueB(String valueB) {
        this.valueB = valueB;
    }

    public String getValueB() {
        return valueB;
    }

}
