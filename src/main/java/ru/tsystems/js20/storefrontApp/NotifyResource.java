package ru.tsystems.js20.storefrontApp;

import org.primefaces.push.annotation.OnMessage;
import org.primefaces.push.annotation.PushEndpoint;
import org.primefaces.push.annotation.Singleton;
import org.primefaces.push.impl.JSONEncoder;

@PushEndpoint("/notify")
@Singleton
public class NotifyResource {

    @OnMessage(encoders = {JSONEncoder.class})
    public String onMessage(String message) {
        return message;
    }
}