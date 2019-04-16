package com.example.feignconsumer.serivce.impl;

import com.example.feignconsumer.serivce.ConsumerService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ConsumerServiceFallback implements ConsumerService {


    @Override
    public String consumer() {

        return "ConsumerServiceFallback";
    }
}
