package ru.tsystems.js20.storefrontApp;

import org.primefaces.push.annotation.OnMessage;
import org.primefaces.push.annotation.PushEndpoint;
import org.primefaces.push.annotation.Singleton;
import org.primefaces.push.impl.JSONEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PushEndpoint("/notify")
@Singleton
public class NotifyResource {

    Logger logger = LoggerFactory.getLogger(getClass());

    @OnMessage(encoders = {JSONEncoder.class})
    public String onMessage(String message) {
        logger.debug("Sending notify message to client");
        return message;
    }
}