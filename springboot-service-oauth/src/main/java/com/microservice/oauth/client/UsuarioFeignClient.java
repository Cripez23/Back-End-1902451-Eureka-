package com.microservice.oauth.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient{"service-usuario"}
public interface UsuarioFeignClient {

}
