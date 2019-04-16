package com.example.feignconsumer.serivce;

import com.example.feignconsumer.serivce.impl.ConsumerServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value = "service-provider", fallback = ConsumerServiceFallback.class)
public interface ConsumerService {


    @RequestMapping("provider")
    String consumer();

}
