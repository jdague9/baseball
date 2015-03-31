package com.wordpress.jordandague.baseball;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

public class BaseballConfiguration extends Configuration {
    
    @NotEmpty
    private String mongoHost;
    
    @Min(1)
    @Max(65535)
    private int mongoPort;
    
    @NotEmpty
    private String mongoName;
    
    @JsonProperty
    public String getMongoHost() {
        return mongoHost;
    }
    
    @JsonProperty
    public int getMongoPort() {
        return mongoPort;
    }
    
    @JsonProperty
    public String getMongoName() {
        return mongoName;
    }
}
