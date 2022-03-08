package org.apache.struts.helloworld.model;

public class MessageStore {
    private String message;

    public MessageStore() {
        message = "Bonjour chers utilisateur";
    }

    public String getMessage() {
        return message;
    }
}