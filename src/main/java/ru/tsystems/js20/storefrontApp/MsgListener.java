package ru.tsystems.js20.storefrontApp;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(name = "Listener1", activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "java:/jms/queue/watchShop"),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class MsgListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        try {
            if(message.getBody(String.class).equals("UPDATE")){
                System.out.println("GOT IT");            }
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
