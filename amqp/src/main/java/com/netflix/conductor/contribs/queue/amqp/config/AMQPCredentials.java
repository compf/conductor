package com.netflix.conductor.contribs.queue.amqp.config;

import com.rabbitmq.client.ConnectionFactory;

public class AMQPCredentials {

    private String hosts = ConnectionFactory.DEFAULT_HOST;
    private String username = ConnectionFactory.DEFAULT_USER;
    private String password = ConnectionFactory.DEFAULT_PASS;
    private String virtualHost = ConnectionFactory.DEFAULT_VHOST;
    private int port = ConnectionFactory.DEFAULT_AMQP_PORT;

    // Getters and setters for each field

}