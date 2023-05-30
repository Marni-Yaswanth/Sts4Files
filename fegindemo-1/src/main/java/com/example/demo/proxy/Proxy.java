package com.example.demo.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="feign",url="hhtp:localhost")
public interface Proxy {

}
