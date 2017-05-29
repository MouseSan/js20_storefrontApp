package ru.tsystems.js20.storefrontApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.tsystems.js20.storefrontApp.service.ProductService;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(name = "Listener1", activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "java:/jms/queue/watchShop"),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class MsgListener implements MessageListener {

    @Inject
    private ProductService productService;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void onMessage(Message message) {
        logger.debug("Message received: {}", message);
        try {
            if(message.getBody(String.class).equals("UPDATE")){
                logger.debug("Start updating products");
                productService.updateProducts();
            }
        } catch (JMSException e) {
            logger.warn("Error during message reading: {}", e.getMessage());
            e.printStackTrace();
        }
    }
}
