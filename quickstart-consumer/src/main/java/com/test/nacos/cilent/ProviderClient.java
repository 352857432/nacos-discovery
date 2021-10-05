package com.test.nacos.cilent;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "quickstart-provider")
public interface ProviderClient {
    @GetMapping("/service")
    public String service();
}
