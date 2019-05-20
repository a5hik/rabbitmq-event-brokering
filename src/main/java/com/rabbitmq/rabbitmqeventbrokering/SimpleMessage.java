package com.rabbitmq.rabbitmqeventbrokering;

import java.io.Serializable;

public class SimpleMessage implements Serializable {

    private String name;
    private String description;

    public SimpleMessage() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SimpleMessage { name=" + this.name + ", description=" + this.description + "}";
    }
}
