package com.zhch.demo04;

import org.springframework.boot.context.properties.ConfigurationProperties;

//第三种，配置指定class,不需要在类上有Comonent
@ConfigurationProperties(prefix="demo04.mail")
public class MailProperty {

    private String host;
    private int port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "{host:" + host + ", port:" + port + "}";
    }
}
