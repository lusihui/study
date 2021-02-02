package com.lsh.actuator.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "myEndpoint")
public class MyEndpoint {
    private String value = "demo";

    @WriteOperation
    public void setValue(String name){
        value = name;
    }

    @ReadOperation
    public String getValue(){
        return value;
    }
}
